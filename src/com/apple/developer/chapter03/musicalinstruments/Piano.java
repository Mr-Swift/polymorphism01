package com.apple.developer.chapter03.musicalinstruments;

public class Piano extends Instrument {
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void play() {
        System.out.println("音乐家在弹" + this.name);

    }
}
