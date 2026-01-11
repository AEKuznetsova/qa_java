package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> responseList = feline.eatMeat();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), responseList);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String responseFamily = feline.getFamily();
        Assert.assertEquals("Кошачьи", responseFamily);
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int kittensCount = feline.getKittens();
        Assert.assertEquals(1, kittensCount);
    }

    @Test
    public void getKittensIntTest() {
        Feline feline = new Feline();
        int kittensCount = feline.getKittens(5);
        Assert.assertEquals(5, kittensCount);
    }
}