package com.example;

import java.util.List;

public class Lion {

    public static final String message = "Используйте допустимые значения пола животного - самец или самка";
    public static final String animalSexMale = "Самец";
    public static final String animalSexFemale = "Самка";

    private boolean hasMane;
    private Feline feline;


    public Lion(Feline feline, String sex) throws Exception {
        this.feline = feline;
        if (animalSexMale.equals(sex)) {
            hasMane = true;
        } else if (animalSexFemale.equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception(message);
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.eatMeat();
    }
}
