package com.simplon;

/**
 * Created by alex on 14/02/2017.
 */
public class Dvd extends Numerique {
    protected enum Movie {HORROR, FUN, ACTION, MUSICAL};
    private Movie movie;
    private boolean is3d;

    public Dvd(String title, int time, Movie movie, boolean is3d){
        super(title, time);
        this.movie = movie;
        this.is3d = is3d;
    }

    @Override
    public String toString() {
        return "Dvd{" + super.toString() +
                ", movie=" + movie +
                ", is3d=" + is3d +
                '}';
    }
}
