package com.cjj.string_table;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("main");
        System.out.println(fun1());
    }

    public static int fun1() {
        int a = 1;
        System.out.println("fun1");
        int b = fun2();
        return a;

    }

    public static int fun2() {
        System.out.println("fun2");
        return 2;
    }
}


