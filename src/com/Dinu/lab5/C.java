package com.Dinu.lab5;

public class C extends B
{
    protected String c;


    public C(String c, com.Dinu.lab5.X x) {
        super("2", x);
        this.c = c;
    }

    public String toString() {
        return super.toString() + "| c = " + c;
    }
}