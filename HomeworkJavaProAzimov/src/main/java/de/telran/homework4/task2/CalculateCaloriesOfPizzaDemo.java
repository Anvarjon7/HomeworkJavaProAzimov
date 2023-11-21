package de.telran.homework4.task2;

import de.telran.userInterface.UserInput;

public class CalculateCaloriesOfPizzaDemo {
    public static void main(String[] args) {
        CalculateOfPizzaCalories calculateOfPizzaCalories = new CalculateOfPizzaCalories();
        UserInput ui = new UserInput();

        System.out.print("Enter diameter for round pizza: ");
        int roundPizzaDiameter = ui.userInput();

        System.out.print("Enter side length for square pizza: ");
        int squarePizzaSideLength = ui.userInput();

        System.out.print("Enter length for rectangle pizza: ");
        int rectanglePizzaLength = ui.userInput();

        System.out.print("Enter width for rectangle pizza: ");
        int rectanglePizzaWidth = ui.userInput();

        int roundPizza = calculateOfPizzaCalories.calculateRadius(roundPizzaDiameter);
        int squarePizza = calculateOfPizzaCalories.calculateSquare(squarePizzaSideLength);
        int rectanglePizza = calculateOfPizzaCalories.calculateRectangle(rectanglePizzaLength,rectanglePizzaWidth);


        System.out.println("Round Pizza Calories -->> " + roundPizza);
        System.out.println("Square Pizza Calories -->> " + squarePizza);
        System.out.println("Rectangle Pizza Calories -->> " + rectanglePizza);







    }
}