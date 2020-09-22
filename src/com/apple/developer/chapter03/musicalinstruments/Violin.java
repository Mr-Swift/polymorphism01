package com.apple.developer.chapter03.musicalinstruments;

public class Violin extends Instrument {
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void play() {
        System.out.println("音乐家在拉" + this.name);

    }
}
