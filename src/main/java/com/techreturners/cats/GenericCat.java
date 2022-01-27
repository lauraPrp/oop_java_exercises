package com.techreturners.cats;

public abstract class GenericCat implements Cat {

    public String setting;
    public int averageHeight;
    public String sound;
    private boolean asleep = false;

    public GenericCat(String setting, int averageHeight, String sound) {
        this.setting = setting;
        this.averageHeight = averageHeight;
        this.sound = sound;
    }


    public String getSetting() {
        return this.setting;
    }

    public int getAverageHeight() {
        return this.averageHeight;
    }

    public boolean isAsleep() {
        return this.asleep;

    }

    public void goToSleep() {
        this.asleep = true;

    }

    public String eat() {
        return sound;
    }

    public void wakeUp() {
        this.asleep = false;
    }



}

