package com.Dinu.lab5;

public class Main {
    public static void main(String[] args) {

        com.Dinu.lab5.X x = new com.Dinu.lab5.X("X");
        com.Dinu.lab5.A a = new com.Dinu.lab5.A("A" , x);
        com.Dinu.lab5.B b = new com.Dinu.lab5.B("B" , x);
        com.Dinu.lab5.C c = new com.Dinu.lab5.C("C", x);
        com.Dinu.lab5.D d = new com.Dinu.lab5.D("D",x);
        com.Dinu.lab5.E e = new com.Dinu.lab5.E("E",x);
        com.Dinu.lab5.F f = new com.Dinu.lab5.F("F",x);
        com.Dinu.lab5.G g = new com.Dinu.lab5.G("G",x);
        com.Dinu.lab5.H h = new com.Dinu.lab5.H("H",x);
        com.Dinu.lab5.I i = new com.Dinu.lab5.I("I", x);
        com.Dinu.lab5.J j = new com.Dinu.lab5.J("J", x);

        System.out.println(
                a + "\n" +
                b + "\n" +
                c + "\n" +
                d + "\n" +
                e + "\n" +
                f + "\n" +
                g + "\n" +
                h + "\n" +
                i + "\n" +
                j
        );
    }
}