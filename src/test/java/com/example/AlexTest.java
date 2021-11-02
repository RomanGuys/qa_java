package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class AlexTest {

    private Alex alex;

    @Before
    public void initObjects() throws Exception {
        alex = new Alex();
    }

    @Test
    public void getFriendsTest() {
        List<String> expectedFriends = List.of("Марти","Глория","Мелман");
        Assert.assertEquals(alex.getFriends(), expectedFriends);
    }

    @Test
    public void getPlaceTest()  {
        String expectedPlace = "Нью-Йорский Зоопарк";
        Assert.assertEquals(expectedPlace,alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() {
        int expectedKittens = 0;
        Assert.assertEquals(expectedKittens, alex.getKittens());
    }


}