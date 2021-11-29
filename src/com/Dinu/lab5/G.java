package com.Dinu.lab5;

public class G extends F {
    protected String g;

    public G(String g, com.Dinu.lab5.X x) {
        super("6", x);
        this.g = g;
    }

    public String toString() {
        return super.toString() + "| g = " + g;
    }
}