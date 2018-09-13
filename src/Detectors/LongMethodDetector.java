package Detectors;

import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.java8Parser;
import java.util.List;
@SuppressWarnings("unchecked")
public class LongMethodDetector<T> extends Detectors.SmellDetector<T> {
    private int controlFlow = 0;

    public LongMethodDetector(ParseTree tree, Pane p, WebEngine webEngine) {
        super(tree, p, webEngine);
    }

    @Override
    public T visitStatement(java8Parser.StatementContext ctx) {
        controlFlow++;
        return (T) visitChildren(ctx);
    }

    @Override
    public T visitMethodBody(java8Parser.MethodBodyContext ctx) {
        List<java8Parser.BlockStatementContext> statements = ctx.block().blockStatements().blockStatement();
        String methodName = ((java8Parser.MethodDeclarationContext)ctx.getParent()).methodHeader().methodDeclarator().Identifier().getText();
        if(statements.size()> 10 ){
            smells.add(new Smell(((java8Parser.MethodDeclarationContext)ctx.parent).start,
                    "This method is too long!.\n"
                            + "Method name: " + methodName , "https://refactoring.guru/smells/long-method"));

        }
        visitChildren(ctx.block());
        if(controlFlow > 15){
            controlFlow = 0;
            smells.add(new Smell(((java8Parser.MethodDeclarationContext)ctx.parent).start,
                    "This method is too long!.\n"
                            + "Method name: " + methodName , "https://refactoring.guru/smells/long-method"));


        }
        return null;
    }
}
