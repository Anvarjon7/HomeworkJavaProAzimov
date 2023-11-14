package de.telran.additionalHometasks;

import de.telran.additionalHometasks.vehicles.Motorbike;

public class MainInformations {

    public static void main(String[] args) {
        Engineer engineer = new Engineer();

        engineer.setName("John Wick");
        engineer.setWeight(75.8);
        engineer.setCountry("New Heaven");
        engineer.setAge(22);
        engineer.setExperience("2 years");

        System.out.println(engineer);

    }
}
