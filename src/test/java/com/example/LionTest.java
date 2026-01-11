package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getLionFood() throws Exception {
        try {
            Lion lion = new Lion(feline, "Самец");
            Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
            List<String> actual = lion.getFood();
            List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
            assertEquals(expected,actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getLionKittens() {
        try {
            Lion lion = new Lion(feline, "Самец");
            Mockito.when(feline.getKittens()).thenReturn(1);
            int expected = 1;
            int actual = lion.getKittens();
            assertEquals(expected,actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = Exception.class)
    public void lionWithOtherParamThrowsException() throws Exception{
        Lion lion = new Lion(feline, "Неопределенный");
    }
}

