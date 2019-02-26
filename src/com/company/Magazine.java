package com.company;

public class Magazine extends Periodical {

    private String genre; //жанр журнала

    public Magazine() {
    }

    public Magazine(double coast, String name, String type, String genre) {
        super(coast, name, type);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Журнал{" +
                "Жанр='" + genre + '\'' +
                '}';
    }
}

