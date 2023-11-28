package de.telran.module_1.lesson_1.module_1.lesson_1.homework5.task1;

public class DietApp {
    public static void main(String[] args) {
        Month month = Month.DECEMBER;
        System.out.println("Текущий месяц: " + month.getRussianName());
        System.out.println(month.recommendDiet());


    }
}
