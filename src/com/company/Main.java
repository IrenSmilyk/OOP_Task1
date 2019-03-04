package com.company;

public class Main {

    public static void main(String[] args) {
        Magazine magazin1 = new Magazine();
        Periodical magazin2 = new Magazine("Cosmopolitan", "Paper", 41.23, "Женский журнал");
        Periodical magazin3 = new Magazine("Elle", "Internet", 42.23, "Женский журнал");
        Newspaper newspaper1 = new Newspaper();
        Periodical newspaper2 = new Newspaper("Аргументы и факты", "Paper", 12.54, "раз в неделю");
        magazin1.setName("Мир рыбалова");
        magazin1.setType("Internet");
        magazin1.setCoast(23.50);
        magazin1.setGenre("Досуг и развлечения");
        newspaper1.setName("Times");
        newspaper1.setType("Internet");
        newspaper1.setCoast(10.70);
        newspaper1.setTypePeriodical("раз в день");
        System.out.println(magazin1.toString());
        System.out.println(magazin2.toString());
        System.out.println(magazin3.toString());
        System.out.println(newspaper1.toString());
        System.out.println(newspaper2.toString());
        System.out.println("Количество периодических изданий: " + Periodical.getCount());
        System.out.println("Количество журналов: " + Magazine.getCount());
        System.out.println("Количество газет: " + Newspaper.getCount());
        System.out.println("Средняя стоимость переодического издания: " + Periodical.getAverageSum());


    }

}
