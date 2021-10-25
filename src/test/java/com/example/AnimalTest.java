package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AnimalTest {

    Animal animal = new Animal();

    @Test
    public void getFoodPredatorTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertTrue(animal.getFood("Хищник").containsAll(expectedFood));
    }

    @Test
    public void getFoodHerbivorousTest() throws Exception {
        List<String> expectedFood = List.of("Трава", "Различные растения");
        Assert.assertTrue(animal.getFood("Травоядное").containsAll(expectedFood));
    }

    @Test
    public void getFoodExceptionTest() {
        try {
            animal.getFood("Бобёр");
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(),"Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }

    @Test
    public void getFamilyTest(){
        Assert.assertEquals(animal.getFamily(),("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи"));
    }


}