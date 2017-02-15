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
    private List<Dvd> dvds = new ArrayList<>();
    private List<Cd> cds = new ArrayList<>();
    private List<Book> books = new ArrayList<>();

    public Library (List<Dvd> dvds, List<Cd> cds, List<Book> books){
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
    }

    public ArrayList<Book> putBooks(List<Book> books) {
    }
}

