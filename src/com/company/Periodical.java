package com.company;

abstract class Periodical {
    private double coast;
    private String name;
    private String type; //бумажные или интернет издания

    private static int count;
    private static double sumPrice;

    Periodical() {
    }

    Periodical(double coast, String name, String type) {
        this.coast = coast;
        this.name = name;
        this.type = type;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Периодическое издание{" +
                "Название=" + name  +
                ", Тип издания='" + type + '\'' +
                ", Цена='" + coast + '\'' +
                '}';
    }

    static public double getAverageSum(){
        return sumPrice / count;
    }
}
