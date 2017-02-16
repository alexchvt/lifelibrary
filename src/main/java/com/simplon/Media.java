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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Media media = (Media) o;

        return title != null ? title.equals(media.title) : media.title == null;
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }
}
