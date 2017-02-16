package com.simplon;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 15/02/2017.
 */
public class Library {
    private static final int OUVERTURE = 1;
    private static final int FERMETURE = 7;
    private static final int STOCK_MAX_DVD = 3;
    private ArrayList<Dvd> dvds = new ArrayList<>();
    private ArrayList<Cd> cds = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();

    public Library (ArrayList<Dvd> dvds, ArrayList<Cd> cds, ArrayList<Book> books){
        this.dvds = dvds;
        this.books = books;
        this.cds = cds;
    }

    public Library (){};

    @Override
    public String toString() {
        return "Library{" + "\n" +
                ", ouverture=" + OUVERTURE + "h \n" +
                ", fermeture=" + FERMETURE + "h \n" +
                ", dvds=" + dvds + "\n" +
                ", cds=" + cds + "\n" +
                ", books=" + books +
                '}';
    }




    public boolean isOpen(int hour) {
        if (hour >= FERMETURE || hour < OUVERTURE)
            return false;
        else
            return true;
    }

    public ArrayList<Book> putBooks(ArrayList<Book> books) {
        this.books.addAll(books);
        return this.books;
    }

    public ArrayList<Dvd> putDvds(ArrayList<Dvd> dvds) {
        this.dvds.addAll(dvds);
        return this.dvds;
    }

    public ArrayList<Cd> putCds(ArrayList<Cd> cds) {
        this.cds.addAll(cds);
        return this.cds;
    }
}

