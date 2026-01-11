package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import java.util.List;

public class AlexTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Alex alex = new Alex(feline);
        int kittensCount = alex.getKittens();
        Assert.assertEquals(0, kittensCount);
    }

    @Test
    public void getFriendsTest() throws Exception {
        Alex alex = new Alex(feline);
        List<String> friendList = alex.getFriends();
        Assert.assertEquals(List.of("Марти", "Глория", "Мелман"), friendList);
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        Alex alex = new Alex(feline);
        String placeOfLiving = alex.getPlaceOfLiving();
        Assert.assertEquals("Нью-Йоркский зоопарк", placeOfLiving);
    }
}