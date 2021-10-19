package com.Dinu.lab3;

import com.Dinu.lab3.TextManipulator;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

        public static void main(String[] arg){
            System.out.println("Introduce the text:");

            Scanner sc= new Scanner(System.in);

            String text= sc.nextLine();
            TextManipulator myText = new TextManipulator(text);
            System.out.println("My text has:");
            System.out.println(myText.getWords() + " words");
            System.out.println(myText.getSenteceCount() + " sentences");
            System.out.println(myText.getLettersCount() +" letters");
            System.out.println(myText.getVowelsCount() + " vowels");
            System.out.println(myText.getConsonantsCount() + " consonants");

            String[] splited = text.split(" ");
            Arrays.sort(splited);
            int max = 0;
            int count= 1;
            String word = splited[0];
            String curr = splited[0];
            for(int i = 1; i<splited.length; i++){
                if(splited[i].equals(curr)){
                    count++;
                } else {
                    count =1;
                    curr = splited[i];
                }
                if(max<count){
                    max = count;
                    word = splited[i];
                }
            }
            System.out.println("\n '" + word + "' " + max + " " + "times");
        }

        }

