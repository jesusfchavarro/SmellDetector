package Detectors;

import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.java8Parser;

public class LongClassAndDataClass<T> extends SmellDetector<T> {
    private int methods = 0;
    private int GettersAndSetters = 0;
    private int field = 0;
    private int innerClasses = 0;
    private int innerInterfaces = 0;

    public LongClassAndDataClass(ParseTree tree, Pane p, WebEngine webEngine) {
        super(tree, p, webEngine);
    }

    @Override
    public T visitClassBody(java8Parser.ClassBodyContext ctx){
        visitChildren(ctx);
        double largeRate = (methods * 0.24 + field * 0.16 + innerInterfaces * 0.30 + innerClasses * 0.30)/5;
        if(largeRate > 1){
            smells.add(new Smell(((java8Parser.NormalClassDeclarationContext)ctx.parent).start,
                    "This class is to enormous!.\n", "https://refactoring.guru/smells/large-class"));
        }
        int logicMethods = methods - GettersAndSetters;
        if(logicMethods < 3){
            smells.add(new Smell(((java8Parser.NormalClassDeclarationContext)ctx.parent).start,
                    "This class is just a bunch of data!.\n", "https://refactoring.guru/smells/data-class"));
        }
        return null;
    }

    @Override
    public T visitClassMemberDeclaration(java8Parser.ClassMemberDeclarationContext ctx) {
        if(ctx.fieldDeclaration() != null){
            field += ctx.fieldDeclaration().variableDeclaratorList().variableDeclarator().size();

        }else if (ctx.methodDeclaration() != null) {
            methods++;
            String methodName = ctx.methodDeclaration().methodHeader().methodDeclarator().Identifier().getText();
            boolean isGet = methodName.startsWith("get") || methodName.startsWith("is");
            boolean isSet = methodName.startsWith("set");
            if(isGet || isSet){
                GettersAndSetters++;
            }
        } else if (ctx.classDeclaration() != null) {
            innerClasses++;
        } else if (ctx.interfaceDeclaration() != null) {
            innerInterfaces++;
        }
        return null;
    }
}
