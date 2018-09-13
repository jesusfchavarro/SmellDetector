package Main;

import parser.java8BaseVisitor;
import parser.java8Parser;

import java.util.HashMap;

public class StatisticsVisitor<T> extends java8BaseVisitor<T> {
    HashMap<String, Integer> varStats = new HashMap<>();
    int a,b,c,d,f;

    @Override
    public T visitClassBodyDeclaration(java8Parser.ClassBodyDeclarationContext ctx, int a) {
        int noHaceNada = 0;
        varStats = 3;
        a.b.x.d = 2;
        a = b + a;
        a = b + a;
        a = b + a;
        if (a.v.d) {
            ha();
            varStats++;
            a = a + 1;
        }
        for (int i = 0; i < 10; i++) {
            a = 5+jj;
        }
        for (int i = 0; i < 10; i++) {
            a = 5+jj;
        }
        return null;
    }

    public T visitClassBodyDeclaration(int ctx, int a, String aa, Pet a, float i) {
        return null;
    }

    public T metodo1(int ctx, int a, String aa, Pet a, float i) {
        return null;
    }

    public T metodo1(int ctx, int a, String aa, Pet a, float i) {
        return null;
    }
    public T metodo2(int ctx, int a, String aa, Pet a, float i) {
        return null;
    }
    public T metodo3(int ctx, int a, String aa, Pet a, float i) {
        return null;
    }
    public T metodo4(int ctx, int a, String aa, Pet a, float i) {
        return null;
    }
    public T metodo5(int ctx, int a, String aa, Pet a, float i) {
        return null;
    }
    public T metodo6(int ctx, int a, String aa, Pet a, float i) {
        return null;
    }
    public T metodo7(int ctx, int a, String aa, Pet a, float i) {
        return null;
    }
    public T metodo8(int ctx, int a, String aa, Pet a, float i) {
        return null;
    }
    public T metodo9(int ctx, int a, String aa, Pet a, float i) {
        return null;
    }
    public T metodo10(int ctx, int a, String aa, Pet a, float i) {
        return null;
    }
    public T metodo11(int ctx, int a, String aa, Pet a, float i) {
        return null;
    }
    public T metodo12(int ctx, int a, String aa, Pet a, float i) {
        return null;
    }
}