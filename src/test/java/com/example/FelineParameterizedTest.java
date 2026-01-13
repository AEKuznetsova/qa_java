package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int actualValue;
    private final int expectedValue;

    public FelineParameterizedTest(int actualValue, int expectedValue) {
        this.actualValue = actualValue;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {4, 4}
        };
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(actualValue);
        assertEquals(expectedValue,actual);
    }
}
