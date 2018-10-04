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

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public boolean equals(Person p) {
        return this.firstName.equals(p.getFirstName()) && this.familyName.equals(p.getFamilyName());
    }
}