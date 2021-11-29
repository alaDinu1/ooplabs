package com.Dinu.lab5;

public class F extends E {
    protected String f;

    public F(String f, com.Dinu.lab5.X x) {
        super("5", x);
        this.f = f;
    }

    public String toString() {
        return super.toString() + "| f = " + f;
    }
}