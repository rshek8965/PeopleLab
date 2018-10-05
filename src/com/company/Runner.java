package com.company;

public class Runner {
    static String firstNames[] = {"Sarah","Grace","Someone","That Kid","Supercalifragilistic"};
    static String familyNames[] = {"Fishsticks","Broccoli","Ramen","Salmon","Expialidocious"};
    /*
    These are the fields that we use to create first names and family names for students to use.
     */

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Orange","Pineapple","The Art of Failure","Mrs");
        Student[] students = new Student[5];
        /*
        The Teacher statement creates a new Teacher with the parameters that we specified in our other classes.
         */

        for(int i = 0; i < firstNames.length;i++)
        {
            students[i] = randomStudent();
       }
       /*
       This loop creates the number of students specified by the length of the objects in firstNames.
       It uses the function randomStudent() for the information.
        */

        Classroom classr = new Classroom(teacher, students);
        classr.printClass();
        System.out.println(classr.classAverage());
        /*
          The Classroom function that was created in the Classroom class before
          is used to combine the teacher and the students. The information is printed and the students'
          gpas are combined and averaged and printed as well.
         */
    }

    public static Student randomStudent() {
        int index = (int) (5* Math.random());
        int gpa = (int) (100 * Math.random());
        return new Student(firstNames[index], familyNames[index], gpa, "o", 45);
    }
    /*
    It's using a randomly generated index to pull names, and randomly generates a gpa, and the gender and age can be specified here as well.
     */
}
