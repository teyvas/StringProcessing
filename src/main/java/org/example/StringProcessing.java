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
                sum ++;
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


    private int index = 0;

    public double calculateExpression(String expression) {
        index = 0;  // Reset the index for each new evaluation
        return parseExpression(expression);
    }

    // Helper method to parse the entire expression
    private double parseExpression(String expression) {
        double result = parseTerm(expression);

        while (index < expression.length()) {
            char operator = expression.charAt(index);

            if (operator == '+' || operator == '-') {
                index++;  // Move to the next character after the operator
                double nextTerm = parseTerm(expression);

                if (operator == '+') {
                    result += nextTerm;
                } else if (operator == '-') {
                    result -= nextTerm;
                }
            } else {
                break;  // End of expression or non-additive operator encountered
            }
        }

        return result;
    }

    // Helper method to parse terms (handles *, /)
    private double parseTerm(String expression) {
        double result = parseFactor(expression);

        while (index < expression.length()) {
            char operator = expression.charAt(index);

            if (operator == '*' || operator == '/') {
                index++;  // Move to the next character after the operator
                double nextFactor = parseFactor(expression);

                if (operator == '*') {
                    result *= nextFactor;
                } else if (operator == '/') {
                    result /= nextFactor;
                }
            } else {
                break;  // End of term or non-multiplicative operator encountered
            }
        }

        return result;
    }

    // Helper method to parse factors (numbers and expressions inside parentheses)
    private double parseFactor(String expression) {
        double result = 0;
        boolean isFraction = false;
        double fractionMultiplier = 0.1;

        // Skip spaces
        while (index < expression.length() && expression.charAt(index) == ' ') {
            index++;
        }

        // If the current character is '(', evaluate the expression inside parentheses
        if (expression.charAt(index) == '(') {
            index++;  // Skip the opening '('
            result = parseExpression(expression);
            index++;  // Skip the closing ')'
        } else {
            // Parse a number (can be integer or floating point)
            while (index < expression.length() &&
                    (Character.isDigit(expression.charAt(index)) || expression.charAt(index) == '.')) {

                char c = expression.charAt(index);

                if (c == '.') {
                    isFraction = true;
                } else if (Character.isDigit(c)) {
                    if (isFraction) {
                        result += (c - '0') * fractionMultiplier;
                        fractionMultiplier *= 0.1;
                    } else {
                        result = result * 10 + (c - '0');
                    }
                }

                index++;  // Move to the next character
            }
        }

        return result;
    }


}
