package com.Dinu.lab3;

public class TextManipulator {

    int wordsNumber;
    int senteceCount ;
    int lettersCount ;
    int vowelsCount ;
    int consonantsCount;

    public TextManipulator(String fullText){
        this.wordsNumber = this.splitIntoWords(fullText);
        this.senteceCount = this.sentenceCounter(fullText);
        this.lettersCount = this.lettersCounter(fullText);
        this.vowelsCount = this.vowelsCounter(fullText);
        this.consonantsCount = this.consonantsCounter(this.lettersCount,this.vowelsCount);

    }

    public static boolean isNumeric(final String str) {


        if (str == null || str.length() == 0) {

            return false;
        }

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }


    public int splitIntoWords(String fullText){
        int count = 0;

        String[] splited =fullText.split(" ");
        for (int i=1;i<splited.length;i++){
            if( !isNumeric(splited[i]) ){
                count++;
            }
        }

        return count;
    }

    public int getWords() {

        return wordsNumber;
    }


    public int sentenceCounter(String fullText){

        int count = 1;
        String[] sentenceList = fullText.split("[!?.:+]");
        for (int i=1;i<sentenceList.length;i++){
            count++;
        }

        return count;
    }

    public int getSenteceCount() {

        return senteceCount;
    }


    public int lettersCounter(String fullText){
        int count = 0;

        for (int i=1;i<fullText.length();i++){
            if (Character.isLetter(fullText.charAt(i))){
                count++;
            }
        }

        return count;
    }

    public int getLettersCount() {

        return lettersCount;
    }

    public int vowelsCounter(String fullText){
        int count = 0;

        for (int i = 0; i < fullText.length(); i++)
        {

            if (fullText.charAt(i) == 'a' || fullText.charAt(i) == 'e'
                    || fullText.charAt(i) == 'i'
                    || fullText.charAt(i) == 'o'
                    || fullText.charAt(i) == 'u'
                    || fullText.charAt(i) == 'A'
                    || fullText.charAt(i) == 'E'
                    || fullText.charAt(i) == 'I'
                    || fullText.charAt(i) == 'O'
                    || fullText.charAt(i) == 'y'
                    || fullText.charAt(i) == 'Y')
            {
                count++;
            }
        }

        return count;

    }

    public int getVowelsCount() {

        return vowelsCount;
    }

    public int consonantsCounter(int letters, int vowels){

        return letters - vowels;

    }

    public int getConsonantsCount() {

        return consonantsCount;
    }
}
