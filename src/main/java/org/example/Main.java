package org.example;

public class Main {
    public static void main(String[] args) {
        String s="Hi12!";
        String numbersStr = "I am here to present 2 and 5 words!";
        String sentence = "Hello! My name is John";
        StringProcessing stringProcessing=new StringProcessing();

        System.out.println(stringProcessing.isStrongPassword(s));

        System.out.println(stringProcessing.calculateDigits(numbersStr);

        System.out.println(stringProcessing.calculateWords(sentence));

    }
}