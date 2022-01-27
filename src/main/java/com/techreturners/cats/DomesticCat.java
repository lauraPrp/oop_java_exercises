package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends GenericCat {

    public DomesticCat() {

        super("domestic", 23, "Purrrrrrr");
    }


    private String generateRandom() {

        Random rand = new Random();
        boolean randomChance = rand.nextBoolean();

        return  randomChance ? "It will do I suppose" : "";
    }

    @Override
    public String eat() {
        System.out.println(generateRandom());
        return sound;
    }
}
