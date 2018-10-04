package com.company;

public class Student extends Person {

    private double GPA;
    private String gender;
    private int age;

    public Student(String firstName, String familyName, double GPA, String gender, int age) {
        super (firstName, familyName);
        this.GPA = GPA;
        this.gender = gender;
        this.age = age;
    }

    public double getGPA() {
        return this.GPA;
    }

    public String toString() {
        return this.getFamilyName() + ", " + this.getFirstName();
    }

}
