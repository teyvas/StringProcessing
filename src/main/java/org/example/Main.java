package org.example;

public class Main {
    public static void main(String[] args) {
        String s="Hi12!";
        String numbersStr = "1254efd5dfddg";
        String sentence = "Hello! My name is John";
        String math= "5+9*78+(23-4)";
        StringProcessing stringProcessing=new StringProcessing();

        System.out.println(stringProcessing.isStrongPassword(s));

        System.out.println(stringProcessing.calculateDigits(numbersStr));

        System.out.println(stringProcessing.calculateWords(sentence));

        System.out.println(stringProcessing.calculateExpression(math));
    }
}