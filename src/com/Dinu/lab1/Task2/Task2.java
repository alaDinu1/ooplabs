package com.Dinu.lab1.Task2;


public class Task2 {
    public static void main(String[] args) {
         Student student1 = new Student();
         student1.name = "Mihai";
         student1.age = 21;
         student1.mark = 8;


         Student student2 = new Student();
         student2.name = "Ana";
         student2.age = 19;
         student2.mark = 9;

         University University1 = new University();
         University1.name = "UTM";
         University1.FoundationYear = 1964;
         University1.students = new Student[] {student1, student2};



         Student student3 = new Student();
         student3.name = "Ion";
         student3.age = 23;
         student3.mark = 6;


         Student student4 = new Student();
         student4.name = "Maria";
         student4.age = 20;
         student4.mark = 7;

         University University2 = new University();
         University2.name = "USM";
         University2.FoundationYear = 1946;
         University2.students = new Student[]{student3, student4};


    }
}
