package com.example;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;

    private final String sex;
    private final boolean expected;

    public LionParameterizedTest(String sex, boolean expected){
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(feline, sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }


}