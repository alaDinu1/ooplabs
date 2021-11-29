package com.Dinu.lab5;

public class E extends D {
    protected String e;

    public E(String e, com.Dinu.lab5.X x) {
        super("4", x);
        this.e = e;
    }

    public String toString() {
        return super.toString() + "| e = " + e;
    }
}