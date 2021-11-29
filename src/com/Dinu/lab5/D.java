package com.Dinu.lab5;

public class D extends C {
    protected String d;
    protected com.Dinu.lab5.X x = new com.Dinu.lab5.X("xdx");

    public D(String d, com.Dinu.lab5.X x) {
        super("3", x);
        this.d = d;
    }

    public String toString() {
        return super.toString() + "| d = " + d;
    }
}