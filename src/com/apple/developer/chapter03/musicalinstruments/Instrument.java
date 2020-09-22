package com.apple.developer.chapter03.musicalinstruments;

public abstract class Instrument {
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void play();

}
