package Main;

import parser.java8BaseVisitor;
import parser.java8Parser;

import java.util.HashMap;

public class StatisticsVisitor<T> extends java8BaseVisitor<T> {
    HashMap<String,Integer[]> varUsage;

    public StatisticsVisitor(HashMap<String, Integer[]> varUsage) {
        this.varUsage = varUsage;
    }

    @Override
    public T visitVariableDeclaratorId(java8Parser.VariableDeclaratorIdContext ctx) {
        String varName = ctx.start.getText();
        Integer[] t = varUsage.getOrDefault(varName,new Integer[]{0,0});
        t[0]++;
        varUsage.put(varName, t);
        return null;
    }

    @Override
    public T visitStatementExpression(java8Parser.StatementExpressionContext ctx) {
        if(ctx.methodInvocation() == null && ctx.classInstanceCreationExpression() == null){
            String varName = ctx.start.getText();
            Integer[] t = varUsage.getOrDefault(varName,new Integer[]{0,0});
            t[1]++;
            varUsage.put(varName, t);
        }
        return visitChildren(ctx);
    }

}
