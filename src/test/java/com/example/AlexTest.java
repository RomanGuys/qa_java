package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class AlexTest {


    @Test
    public void getFriendsTest() throws Exception {
        Alex alex = new Alex();
        List<String> expectedFriends = List.of("Марти","Глория","Мелман");
        Assert.assertEquals(alex.getFriends(), expectedFriends);
    }

    @Test
    public void getPlaceTest() throws Exception {
        Alex alex = new Alex();
        String expectedPlace = "Нью-Йорский Зоопарк";
        Assert.assertEquals(expectedPlace,alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() throws Exception {
        Alex alex = new Alex();
        int expectedKittens = 0;
        Assert.assertEquals(expectedKittens, alex.getKittens());
    }


}