package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StringProcessingTest {
    StringProcessing stringProcessing = new StringProcessing();
    @Test
    void isStrongPassword() {
        assertEquals(true, stringProcessing.isStrongPassword("Q2e!"), "Wrong result");
        assertEquals(false, stringProcessing.isStrongPassword("12345"), "Wrong result");
        assertEquals(true, stringProcessing.isStrongPassword("Fez2005?"), "Wrong result");
    }

    @Test
    void calculateDigits() {
        assertEquals(5, stringProcessing.calculateDigits("1254efd5dfddg"), "Wrong result");
        assertEquals(2, stringProcessing.calculateDigits("dfdf45"), "Wrong result");
        assertEquals(10, stringProcessing.calculateDigits("fdf12dfd3412121df4"), "Wrong result");

    }

    @Test
    void calculateWords() {
        assertEquals(3, stringProcessing.calculateWords("Hi ma345445454name is1"), "Wrong result");
        assertEquals(2, stringProcessing.calculateWords("Hi d!"), "Wrong result");
        assertEquals(1, stringProcessing.calculateWords("H!"), "Wrong result");
    }

    @Test
    void calculateExpression() {
        assertEquals(10, stringProcessing.calculateExpression("(1+2)*4-2"),"Wrong result");
        assertEquals(254, stringProcessing.calculateExpression("25*10+4"), "Wrong result");
        assertEquals(50230, stringProcessing.calculateExpression("4567*(90/45+9)-7"), "Wrong result");
        assertEquals(0, stringProcessing.calculateExpression("(1+2)*4-12"), "Wrong result");
    }

}