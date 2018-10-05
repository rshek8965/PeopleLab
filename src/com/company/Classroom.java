package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * A simplified representation of a classroom.
 */
public class Classroom {
    /**
     * The students in the classroom.
     */
    Student[] students;

    /**
     * The teacher of the classroom.
     */
    Teacher teacher;

    /**
     * Creates a classroom with teacher and its students.
     *
     * @param teacher  the teacher of the class
     * @param students the students of the class
     */
    public Classroom(Teacher teacher, Student[] students) {
        this.teacher = teacher;
        this.students = students;
    }

    /**
     * The subject the classroom's teacher teaches.
     *
     * @return the subject
     */
    public String getSubject() {
        return this.teacher.getSubject();
    }

    /**
     * Returns the class average from the students' GPAs.
     *
     * @return the gpa average of the class
     */
    public double classAverage() {
        return Arrays.stream(students).mapToDouble(v -> v.getGPA()).average().getAsDouble();
    }

    /**
     * Prints out the class to stdout.
     */
    public void printClass() {
        System.out.printf("This class contains %s who teaches %s and whose students are %s.\n",
                this.teacher.toString(),
                this.teacher.getSubject(),
                Arrays.stream(students).map(v -> v.toString()).collect(Collectors.joining("; ")));
    }
}