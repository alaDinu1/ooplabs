package com.Dinu.lab5;

public class A {
    protected String a;
    protected com.Dinu.lab5.X x;

    public A(String a, X x) {
        this.a = a;
        this.x = x;
    }

    public String toString() {
        return "a = " + a + "| x.value = " + x.getX();
    }
}

