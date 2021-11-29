package com.Dinu.lab5;

public class I extends H {
    protected String i;

    public I(String i, com.Dinu.lab5.X x) {
        super("8", x);
        this.i = i;
    }

    public String toString() {
        return super.toString() + "| i = " + i;
    }
}