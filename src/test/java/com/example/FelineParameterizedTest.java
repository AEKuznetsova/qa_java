package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int numberOfKittens;

    public FelineParameterizedTest(int numberOfKittens) {
        this.numberOfKittens = numberOfKittens;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {2},
                {3},
                {4}
        };
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(numberOfKittens);
        assertEquals(numberOfKittens, actual);
    }
}
