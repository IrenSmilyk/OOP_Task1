package com.company;

public class Main {

    public static void main(String[] args) {
        Magazine magazin1 = new Magazine();
        Magazine magazin2 = new Magazine("Cosmopolitan", "Paper", 41.23, "Женский журнал");
        Magazine magazin3 = new Magazine("Elle", "Internet", 42.23, "Женский журнал");
       /* Newspaper newspaper1 = new Newspaper();
        Newspaper newspaper2 = new Newspaper();*/
        magazin1.setName("Мир рыбалова");
        magazin1.setType("Internet");
        magazin1.setCoast(23.50);
        magazin1.setGenre("Досуг и развлечения");
        System.out.println(magazin1.toString());
        System.out.println(magazin2.toString());
        System.out.println(magazin3.toString());
        System.out.println("Количество журналов: " + Magazine.getCount());
        //System.out.println("Общая стоимость журналов: " + Magazine.getSumPrice());
        //System.out.println("Средняя стоимость журнала: " + (float) Magazine.getAverageSum());

    }

}
