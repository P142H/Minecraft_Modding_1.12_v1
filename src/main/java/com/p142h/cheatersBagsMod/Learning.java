package com.p142h.cheatersBagsMod;

public class Learning {

    public static void main(String[] args) {
        sout("Умножим 2 на 3:", mult(2, 3));
        System.out.println();
        sout("Квадрат числа 77 - это:", sqrt(77));
        div(10, 0);
    }

    private static int mult(int x, int y) {
        return x * y;
    }

    private static int sqrt(int x) {
        return mult(x, x);
    }

    private static int div(int x, int y) {
        return x / y;
    }

    private static void sout(String s, int x) {
        System.out.println(s + " " + x);
    }
}
