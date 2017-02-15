package com.simplon;

/**
 * Created by alex on 14/02/2017.
 */
public class Book extends Media {
    private int page;

    public Book(String title, int page){
        super(title);
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" + super.toString() +
                ", page=" + page +
                "}\n";
    }
}
