package Detectors;

import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.java8Parser;

public class LongParameterListDetector<T> extends Detectors.SmellDetector<T> {
    public LongParameterListDetector(ParseTree tree, Pane p, WebEngine webEngine) {
        super(tree, p, webEngine);
    }

    @Override
    public T visitMethodDeclarator(java8Parser.MethodDeclaratorContext ctx) {
        String methodName = ctx.Identifier().toString();
        String[] parameters = ctx.formalParameterList().getText().split(",");
        int c = parameters.length;
        if (c > 4){
            smells.add(new Smell(((java8Parser.MethodDeclarationContext)ctx.parent.parent).start,
                    "This method have a lot of parameters!.\n"
                            + "Method name: " + methodName , "https://refactoring.guru/smells/long-parameter-list"));
        }
        return null;
    }


}
