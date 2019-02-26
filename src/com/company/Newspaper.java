package com.company;

public class Newspaper extends Periodical {
      private String typePeriodical; //ежедневные, еженедельные, ежемесячные

    public Newspaper() {
    }

    public Newspaper(double coast, String name, String type, String typePeriodical) {
        super(coast, name, type);
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
