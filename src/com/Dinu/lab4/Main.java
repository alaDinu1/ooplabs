package com.Dinu.lab4;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


    public class Main {
        public static void main(String[] args) {
            Validator_parentheses textFile = new Validator_parentheses();

            try {
                File f = new File("/Users/Admin/Documents/GitHub/ooplabs/src/com/Dinu/lab4/one_expression.txt");
                Scanner FileReader = new Scanner(f);
                while(FileReader.hasNextLine()){
                    textFile.expression = FileReader.nextLine();

                    if (textFile.Check()) {
                        System.out.println("The parentheses are put correct in this expression");
                    }
                    else System.out.println("The parentheses are not put correct in this expression");
                }
                FileReader.close();
            }
            catch (FileNotFoundException e) {
                System.out.println("Error! File was not found!");
                e.printStackTrace();
            }
        }
    }
