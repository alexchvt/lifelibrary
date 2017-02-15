package com.simplon;

/**
 * Created by alex on 14/02/2017.
 */
public class Cd extends Numerique {

    public Cd(String title, int time){
        super(title, time);
    }

    @Override
    public String toString() {
        return "Cd{" + super.toString() + "}";
    }
}
