package de.telran.module_1.lesson_1.module_1.lesson_1.userInterface;

import java.util.Scanner;

public class UserInput {

        public int userInput() {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            return input;
        }
        public double userDouble(){
            Scanner scanner = new Scanner(System.in);
            double input2 = scanner.nextDouble();
            return input2;
        }
        public String userText(){
            Scanner scanner = new Scanner(System.in);
            String inputText = scanner.nextLine();
            return inputText;
        }

}
