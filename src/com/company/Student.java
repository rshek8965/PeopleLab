package com.company;

/**
 * A simplified model of a student.
 */
public class Student extends Person {
    /**
     * The student's GPA.
     */
    private double GPA;

    /**
     * The student's gender.
     */
    private String gender;

    /**
     * The student's age.
     */
    private int age;

    /**
     * Creates a Student with a specified name, gpa, gender, and age.
     *
     * @param firstName  the student's first name
     * @param familyName the student's surname
     * @param GPA        the student's gpa
     * @param gender     the student's gender
     * @param age        the student's age
     */
    public Student(String firstName, String familyName, double GPA, String gender, int age) {
        super(firstName, familyName);
        this.GPA = GPA;
        this.gender = gender;
        this.age = age;
    }

    /**
     * Retrieves the student's GPA.
     *
     * @return the student's gpa
     */
    public double getGPA() {
        return this.GPA;
    }

    /**
     * Redefines the toString() output to `familyName, firstName`.
     *
     * @return the redefined string format
     */
    public String toString() {
        return this.getFamilyName() + ", " + this.getFirstName();
    }

}
