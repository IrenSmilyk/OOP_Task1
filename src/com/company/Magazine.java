package com.company;

public class Magazine extends Periodical {

    private String genre; //жанр журнала
    private static int count;
    private static int count1;

    Magazine() {
        count++;
    }

    Magazine(String name, String type, double coast, String genre) {
        super(name, type, coast);
        this.genre = genre;
        count1++;
    }

    static public int getCount() {
        return count + count1;
    }

    private String getGenre() {
        return genre;
    }

    void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Журнал: "+super.toString() + ", Жанр - " + getGenre()+ ";";
    }

}

