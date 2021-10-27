package com.example;

import java.util.List;

public class Alex extends Lion {

    public Alex() throws Exception {
        super("Самец", new Feline());
    }

    public List<String> getFriends(){
        return List.of("Марти","Глория","Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йорский Зоопарк";
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }
}
