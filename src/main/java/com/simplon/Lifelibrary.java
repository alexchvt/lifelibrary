package com.simplon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Lifelibrary
{
    public static void main( String[] args ){

        Book book1 = new Book("book1",120);
        Book book2 = new Book("book2",240);
        Book book3 = new Book("book3",320);
        Cd cd1 = new Cd("cd1", 54);
        Cd cd2 = new Cd("cd2", 45);
        Cd cd3 = new Cd("cd3", 72);
        Dvd dvd1 = new Dvd("dvd1", 120, Dvd.Movie.HORROR,false);
        Dvd dvd2 = new Dvd("dvd2", 160, Dvd.Movie.ACTION,true);
        Dvd dvd3 = new Dvd("dvd3", 175, Dvd.Movie.MUSICAL,false);


        System.out.println(book1);
        System.out.println(cd1);
        System.out.println(dvd1);



    }
}
