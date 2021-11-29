package com.Dinu.lab5;

public class H extends G {
    protected String h;
    private com.Dinu.lab5.X x = new com.Dinu.lab5.X("xhx");

    public H(String h, com.Dinu.lab5.X x) {
        super("7", x);
        this.h = h;
    }

    public String toString() {
        return super.toString() + "| h = " + h;
    }
}