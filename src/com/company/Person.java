package com.company;

/**
 * An extremely simplified model of a human.
 */
public abstract class Person {
    /**
     * The first name of the person.
     */
    private String firstName;

    /**
     * The last name of the person.
     */
    private String familyName;

    /**
     * Creates a Person with firstName and familyName.
     *
     * @param firstName  the person's first name
     * @param familyName the person's surname
     */
    public Person(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    /**
     * Retrieves the person's first name.
     *
     * @return his/her first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Sets the Person's first name.
     *
     * @param firstName the new first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Retrieves the person's family name.
     *
     * @return his/her surname
     */
    public String getFamilyName() {
        return this.familyName;
    }

    /**
     * Sets the Person's family name.
     *
     * @param familyName the new surname
     */
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    /**
     * Checks whether `p` is the same Person as the current one.
     *
     * @param p the Person to compare to see if it's the same one
     * @return whether or not they are the same person
     */
    public boolean equals(Person p) {
        return this.firstName.equals(p.getFirstName()) && this.familyName.equals(p.getFamilyName());
    }
}