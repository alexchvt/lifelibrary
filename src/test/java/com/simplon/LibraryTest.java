package com.simplon;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by alex on 15/02/2017.
 */
public class LibraryTest {
    @Test
    public void isOpen_between_1pm_7pm() {
        //set
        Library library = new Library();
        int hour = 3;
        //test
        boolean result = library.isOpen(hour);
        //assert
        assertTrue(result);
    }
    @Test
    public void isOpen_not() {
        //set
        //set
        Library library = new Library();
        int hour = 8;
        //test
        boolean result = library.isOpen(hour);
        //assert
        assertFalse(result);
    }

    @Test
    public void putBooks() {
        //set
        Book booka = new Book("booka", 120);
        Book bookb = new Book("bookb", 360);
        ArrayList<Book> books = new ArrayList<>();
        books.addAll(Arrays.asList(booka, bookb));
        Library library = new Library(new ArrayList<>(), new ArrayList<>(), books);
        ArrayList<Book> newbooks = new ArrayList<>();
        Book bookc = new Book("bookc", 230);
        newbooks.add(bookc);
        ArrayList<Book> booktest = new ArrayList<>();
        booktest.addAll(books);
        booktest.addAll(newbooks);
        //test
        ArrayList<Book> result = library.putBooks(newbooks);
        //assert
        assertArrayEquals(booktest.toArray(), result.toArray());
    }

    @Test
    public void putDvds() {
        //set
        Dvd dvda = new Dvd("dvda", 160, Dvd.Movie.MUSICAL, false);
        Dvd dvdb = new Dvd("dvdb", 150, Dvd.Movie.ACTION, true);
        ArrayList<Dvd> dvds = new ArrayList<>();
        dvds.addAll(Arrays.asList(dvda, dvdb));
        Library library = new Library(dvds, new ArrayList<>(), new ArrayList<>());
        ArrayList<Dvd> newdvds = new ArrayList<>();
        Dvd dvdc = new Dvd("dvdc", 45, Dvd.Movie.HORROR, true);
        newdvds.add(dvdc);
        ArrayList<Dvd> dvdtest = new ArrayList<>();
        dvdtest.addAll(dvds);
        dvdtest.addAll(newdvds);
        //test
        ArrayList<Dvd> result = library.putDvds(newdvds);
        //assert
        assertArrayEquals(dvdtest.toArray(), result.toArray());
    }

    @Test
    public void putDvdsmax () {
        //set

        //test
        //assert
    }

    @Test
    public void putCds() {
        //set
        Cd cda = new Cd("cda", 60);
        Cd cdb = new Cd("cdb", 50);
        ArrayList<Cd> cds = new ArrayList<>();
        cds.addAll(Arrays.asList(cda, cdb));
        Library library = new Library(new ArrayList<>(), cds, new ArrayList<>());
        ArrayList<Cd> newcds = new ArrayList<>();
        Cd cdc = new Cd("cdc", 45);
        newcds.add(cdc);
        ArrayList<Cd> cdtest = new ArrayList<>();
        cdtest.addAll(cds);
        cdtest.addAll(newcds);
        //test
        ArrayList<Cd> result = library.putCds(newcds);
        //assert
        assertArrayEquals(cdtest.toArray(), result.toArray());
    }
}