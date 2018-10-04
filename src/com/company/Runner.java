package com.company;

import java.util.stream.IntStream;

public class Runner {
    static String[] firstNames = { "a", "b", "c", "d", "e", "f" };
    static String[] familyNames = { "ab", "cd", "ef", "gh", "ij", "kl" };

    public static void main(String[] args) {
        Teacher teacher = new Teacher("g", "Mn", "CSA", "Mr");
        Student[] students = new Student[5];

        IntStream.range(0, 5).forEach(v -> students[v] = Runner.randomStudent());
        Classroom fakeClass = new Classroom(teacher, students);

        fakeClass.printClass();
        System.out.println(fakeClass.classAverage());
    }

    public static Student randomStudent() {
        int randomInt = (int) (Math.random() * firstNames.length);
        return new Student(firstNames[randomInt], familyNames[randomInt], Math.random() * 100 + 1, "male", 15);
    }
}
