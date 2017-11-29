package Main;

import parser.java8BaseVisitor;
import parser.java8Parser;

import java.util.HashMap;

public class StatisticsVisitor<T> extends java8BaseVisitor<T> {
    HashMap<String,Integer> varStats = new HashMap<>();

    @Override
    public T visitExpressionName(java8Parser.ExpressionNameContext ctx) {
        System.out.println(ctx.getText());
        java8Parser.AmbiguousNameContext tmp = ctx.ambiguousName();
        while(tmp.ambiguousName() != null ){
            tmp = tmp.ambiguousName();
        }
        String varName = tmp == null ? ctx.getText() : tmp.getText();
        int t = varStats.getOrDefault(tmp.getText(),0);
        varStats.put(varName, t + 1);
        return visitChildren(ctx);
    }

}
