package com.simplon;

/**
 * Created by alex on 14/02/2017.
 */
public class Numerique extends Media {
    private int time ;

    public Numerique(String title, int time){
        super(title);
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString() + ", time=" + time ;
    }
}
