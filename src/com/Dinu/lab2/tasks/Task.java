package com.Dinu.lab2.tasks;

public class Task {
    public static void main(String[] args) {


        Boxes Box1 = new Boxes();
        Boxes Box2 = new Boxes(5);
        Boxes Box3 = new Boxes(7, 15, 5);
        Queue queue1 = new Queue();
        Queue queue2 = new Queue(4);
        queue1.push(Box1);
        queue1.push(Box2);
        queue1.push(Box3);
        queue1.pop();
        queue1.checkIfEmpty(); //Task3
        queue2.push(Box1);
        queue2.push(Box2);
        queue2.push(Box3);
        queue2.push(Box3);
        queue2.pop();
        queue2.checkIfEmpty();


        //Task3
        System.out.println("The area of Box3 is: " + Box3.area);
        System.out.println("The volume of Box3 is: " + Box3.volume);
        }

        }


