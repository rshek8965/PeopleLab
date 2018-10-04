package com.company;

public class Teacher extends Person {
    private String subject;
    private String title;

    public Teacher(String subject, String title)
    {
        super("Person","Person");
        this.subject = subject;
        this.title = title;
    }

    public String getSubject()
    {
        return this.subject;
    }

    public String toString()
    {
        return this.title + "." + this.getFamilyName();
    }

}
