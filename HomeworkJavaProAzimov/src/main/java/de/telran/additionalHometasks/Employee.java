package de.telran.additionalHometasks;

public class Employee extends Human{
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "age=" + age +
                "} " + super.toString();
    }
}
