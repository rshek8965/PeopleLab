package com.company;

public abstract class Person {

    private String firstName;
    private String familyName;

    public String getFirstName() {
        return this.firstName;
    }

    public String getFamilyname() {
        return this.familyName;
    }

    public boolean equals(Person p) {
        return p.firstName.equals(p.familyName);
    }

    public Person(String firstName, String familyName) {
        this.firstName=firstName;
        this.familyName=familyName;
    }
 }
