package com.Dinu.lab5;

public class J extends I {
    protected String j;

    public J(String j, com.Dinu.lab5.X x) {
        super("9", x);
        this.j = j;
    }

    public String toString() {
        return super.toString() + "| j = " + j;
    }
}