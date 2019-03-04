package com.company;

public class Newspaper extends Periodical {
    private String typePeriodical; //ежедневные, еженедельные, ежемесячные
    private static int count;
    private static int count1;

    Newspaper() {
        count++;
    }

    Newspaper(String name, String type, double coast, String typePeriodical) {
        super(name, type, coast);
        this.typePeriodical = typePeriodical;
        count1++;
    }

    public String getTypePeriodical() {
        return typePeriodical;
    }

    void setTypePeriodical(String typePeriodical) {
        this.typePeriodical = typePeriodical;
    }

    static public int getCount() {
        return count + count1;
    }

    @Override
    public String toString() {
        return "Газета: " + super.toString() + ", Периодичность выпуска газеты - " + typePeriodical + ";";
    }
}
