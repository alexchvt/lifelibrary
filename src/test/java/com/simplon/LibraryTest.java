package com.simplon;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by alex on 15/02/2017.
 */
public class LibraryTest {
    @Test
    public void isOpen_between_1pm_7pm (){
        //set
        Library library = new Library();
        int hour = 3;
        //test
        boolean result = library.isOpen(hour);
        //assert
        assertTrue(true, result);
    }

    @Test
    public void isClose_between_7pm_1pm (){
        //set
        Library library = new Library();
        int hour = 8;
        //test
        boolean result = library.isOpen(hour);
        //assert
        assertTrue(false, result);
    }

    @Test
    public void putBooks (){
        //set
        Library library = new Library();
        //test
        List<Book> books = new ArrayList<>();
        Book book = new Book("booka", 120);
        books.add(book);
        ArrayList<Book> result = library.putBooks(books);
        //assert
        assertArrayEquals(books, result);
    }




}