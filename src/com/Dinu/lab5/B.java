package com.Dinu.lab5;


public class B extends A
{
    protected String b;

    public B(String b, com.Dinu.lab5.X x) {
        super("1", x);
        this.b = b;
    }

    public String toString() {
        return super.toString() + "| b = " + b;
    }
}