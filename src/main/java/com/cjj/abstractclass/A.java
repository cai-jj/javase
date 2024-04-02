package com.cjj.abstractclass;

public abstract class A {

    private String name;
    public A() {}

    static {
        System.out.println("abstract A");
    }

    public A(String name) {
        this.name = name;
    }
    public void fun() {
        System.out.println("fun A");
    }

    public static void fun3() {

    }

    public abstract void fun1();
}
