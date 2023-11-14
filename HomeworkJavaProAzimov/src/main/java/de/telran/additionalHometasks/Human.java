package de.telran.additionalHometasks;

public class Human extends Earthling{

    private String country;

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Human {" +
                "country='" + country + '\'' +
                "} " + super.toString();
    }
}
