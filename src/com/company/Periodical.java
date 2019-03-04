package com.company;

abstract class Periodical {

    private String name;
    private String type; //бумажные или интернет издания
    private double coast;

    private static int count;
    private static int count1;

    private static double sumPrice;

    Periodical() {
        count++;
    }

    Periodical(String name, String type, double coast) {
        this.name = name;
        this.type = type;
        this.coast = coast;
        count1++;
        sumPrice+=coast;

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

   private double getCoast() {
        return coast;
    }

    void setCoast(double coast) {
        this.coast = coast;
    }

   static int getCount() {
        return count+count1;
    }



    @Override
    public String toString() {
        return "Название - \'" + name + "\', Тип издания - " + type + ", Цена: " + coast;
    }

    public static double getAverageSum() {
        return sumPrice / (count+count1);
    }
}
