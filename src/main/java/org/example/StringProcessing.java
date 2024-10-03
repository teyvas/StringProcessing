package org.example;
import java.lang.*;
public class StringProcessing {
    public boolean  isStrongPassword(String password){
        boolean capital=false, digit=false, special=false, lower=false;
        for(int i=0;i<password.length();i++){
            if(Character.isUpperCase(password.charAt(i))) capital = true;
            if(Character.isLowerCase(password.charAt(i))) lower = true;
            if(Character.isDigit(password.charAt(i))) digit = true;
            if(!Character.isDigit(i) && !Character.isLetter(i)) special = true;
        }
        return capital && digit && special && lower;
    }

    public int calculateDigits(String string){
        int sum=0;
        for(int i=0;i<string.length();i++){
            if(Character.isDigit(string.charAt(i))) {
                sum += Character.getNumericValue(string.charAt(i));
            }
        }
        return (sum);
    }

    public int calculateWords(String string){
        int sum=1;
        for(int i=0;i<string.length();i++){
            if(Character.isSpaceChar(string.charAt(i))) sum++;
        }
        return sum;
    }



}
