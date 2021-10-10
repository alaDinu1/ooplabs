package com.Dinu.lab2.tasks;
import java.util.ArrayList;
//import java.util.List;

public class Queue {

    private int maxSize;
    private final boolean Parameter;
      private final ArrayList<Boxes> boxes;

    Queue() {
        Parameter = false;
        boxes = new ArrayList<>();

    }

    Queue(int maxSize) {
        Parameter = true;
        boxes = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public void push(Boxes number) {
        if(Parameter) {
            if(boxes.size() < maxSize) {
                boxes.add(number);
            }
            else { System.out.println("The queue is full");

            }
        }

        else { boxes.add(number);

        }
    }


    public void pop() {
        boxes.remove(0);

    }

    public void checkIfEmpty() {
        if(Parameter) {
            System.out.println("The current size: " + boxes.size());
               System.out.println("The maximum size: " + maxSize);

        }

        else {
            System.out.println("It is never full");

        }
    }
}