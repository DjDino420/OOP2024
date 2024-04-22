package oop.labor05.model;

public class Course {
    private final String name;
    private final String description;
    private final int numHours;

    public Course(String name, String description, int numHours) {
        this.name = name;
        this.description = description;
        this.numHours = numHours;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public int getnumHours() {
        return numHours;
    }
    @Override
    public String toString() {
        return name + " " + description + " " + numHours;
    }

}