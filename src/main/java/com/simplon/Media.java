package com.simplon;

/**
 * Created by alex on 14/02/2017.
 */
public class Media {
    private String title;

    public Media(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'';
    }
}
