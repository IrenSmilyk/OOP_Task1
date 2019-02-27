package com.company;

abstract class Periodical {

    private String name;
    private String type; //бумажные или интернет издания
    private double coast;

    private static int count;
    private static double sumPrice;

    Periodical() {
    }

    Periodical(String name, String type, double coast) {
        this.name = name;
        this.type = type;
        this.coast = coast;

    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

   double getCoast() {
        return coast;
    }

    void setCoast(double coast) {
        this.coast = coast;
    }

   static int getCount() {
        return count;
    }


    @Override
    public String toString() {
        return "Периодическое издание{" +
                "Название=" + name +
                ", Тип издания='" + type + '\'' +
                ", Цена='" + coast + '\'' +
                '}';
    }

    static public double getAverageSum() {
        return sumPrice / count;
    }
}
