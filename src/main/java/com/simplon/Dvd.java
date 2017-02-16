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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Dvd dvd = (Dvd) o;

        if (is3d != dvd.is3d) return false;
        return movie == dvd.movie;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (movie != null ? movie.hashCode() : 0);
        result = 31 * result + (is3d ? 1 : 0);
        return result;
    }
}
