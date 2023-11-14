package de.telran.additionalHometasks;

public class Engineer extends Employee{

    private String experience;

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Engineer {" +
                "experience='" + experience + '\'' +
                "} " + super.toString();
    }
}
