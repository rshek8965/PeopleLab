package com.company;

/**
 * A simplified model of a teacher.
 */
public class Teacher extends Person {
    /**
     * The subject the teacher teaches.
     */
    private String subject;

    /**
     * The title to address the teacher by.
     */
    private String title;

    /**
     * Creates a Teacher with a specified name, subject, and title.
     *
     * @param firstName  the teacher's first name
     * @param familyName the teacher's surname
     * @param subject    the subject the teacher teaches
     * @param title      the title to address the teacher by
     */
    public Teacher(String firstName, String familyName, String subject, String title) {
        super(firstName, familyName);
        this.subject = subject;
        this.title = title;
    }

    /**
     * Retrieves the subject taught by the teacher.
     *
     * @return the subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * Redefines the toString() output to `title. familyName`.
     *
     * @return the redefined string format
     */
    public String toString() {
        return this.title + ". " + this.getFamilyName();
    }

}
