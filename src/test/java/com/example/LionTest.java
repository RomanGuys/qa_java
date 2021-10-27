package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {

    private String sex;
    boolean expectedHasMane;

    public LionTest(String sex, boolean expectedHasMane){
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getDataForHasMane(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void LionMaleSexTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        boolean expected = true;
        Assert.assertEquals(lion.hasMane, expected);
    }

    @Test
    public void LionFemaleSexTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        boolean expected = false;
        Assert.assertEquals(lion.hasMane, expected);
    }

    @Test
    public void LionExceptionSexTest() {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Среднее", feline);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "Используйте допустимые значения пола животного - самец или самка");
        }
    }


    @Test
    public void getKittensPositiveTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        System.out.println(lion.getKittens());
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, new Feline());
        boolean actualHasMane = lion.doesHaveMane();
        Assert.assertEquals(expectedHasMane, actualHasMane);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(lion.getFood(),expected);
    }
}