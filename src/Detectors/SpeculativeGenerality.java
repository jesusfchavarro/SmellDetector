package Detectors;

import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.java8Parser;

import java.util.HashMap;
import java.util.Map;

public class SpeculativeGenerality<T> extends SmellDetector<T> {
    HashMap<String, Integer> methods = new HashMap<>();

    public SpeculativeGenerality(ParseTree tree, Pane p, WebEngine webEngine) {
        super(tree, p, webEngine);
    }

    @Override
    public Object visitMethodDeclaration(java8Parser.MethodDeclarationContext ctx) {
        String methodName = ctx.methodHeader().methodDeclarator().Identifier().getText();
        Integer d = methods.getOrDefault(methodName,0);
        methods.put(methodName, --d);
        return super.visitMethodDeclaration(ctx);
    }

    @Override
    public Object visitMethodInvocation(java8Parser.MethodInvocationContext ctx) {
        String methodName;
        if(ctx.methodName() != null){
            methodName = ctx.methodName().getText();
        }else {
            methodName = ctx.Identifier().getText();
        }
        Integer d = methods.getOrDefault(methodName,0);
        methods.put(methodName, ++d);
        return super.visitMethodInvocation(ctx);
    }

    @Override
    public T visitClassBody(java8Parser.ClassBodyContext ctx){
        visitChildren(ctx);

        Map.Entry<String, Integer> e;
        for ( Object entry : methods.entrySet()) {
            e = (Map.Entry<String, Integer>)entry;
            if(e.getValue() < 1){
                smells.add(new Smell(ctx.start,
                        "This method is not used!.\n", "https://refactoring.guru/smells/large-class"));
            }
        }
        return null;
    }
}
