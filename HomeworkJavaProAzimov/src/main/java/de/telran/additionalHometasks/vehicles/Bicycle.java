package de.telran.additionalHometasks.vehicles;

public class Bicycle extends Bus{
    private int year;

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "year=" + year +
                "} " + super.toString();
    }
}
