package com.neuedu.proxy;

public class Arguepro implements Argue {
    @Override
    public String talk() {
        Arguepos arguepos = new Arguepos();
        String talk = arguepos.talk();
        return talk.toUpperCase();
    }
}
