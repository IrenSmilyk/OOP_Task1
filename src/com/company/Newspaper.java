package com.company;

public class Newspaper extends Periodical {
      private String typePeriodical; //ежедневные, еженедельные, ежемесячные
    private static int count;
    private static double sumPrice;

    Newspaper() {
    }

    public Newspaper(String name, String type, double coast, String typePeriodical) {
        super(name, type, coast);
        this.typePeriodical = typePeriodical;
    }

    public String getTypePeriodical() {
        return typePeriodical;
    }

    public void setTypePeriodical(String typePeriodical) {
        this.typePeriodical = typePeriodical;
    }

    @Override
    public String toString() {
        return "Газета{" +
                "Периодичность выхода газеты='" + typePeriodical + '\'' +
                '}';
    }
}
