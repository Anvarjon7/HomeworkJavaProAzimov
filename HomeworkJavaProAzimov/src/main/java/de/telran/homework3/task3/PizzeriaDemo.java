package de.telran.homework3.task3;

import de.telran.homework3.task3.interfacePizzeria.Cook;
import de.telran.homework3.task3.interfacePizzeria.Pizzeria;
import de.telran.homework3.task3.interfacePizzeria.Waiter;

public class PizzeriaDemo {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();


        pizzeria.takeOrder();
        pizzeria.prepareOrder();
        pizzeria.servesOrder();
        pizzeria.clean();
        pizzeria.washDishes();
        pizzeria.calculatePayments();
        pizzeria.raisesAnInvoice();
    }
}
