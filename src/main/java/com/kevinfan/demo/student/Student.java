package com.kevinfan.demo.student;

import java.util.UUID;

/**
 * Student
 */
public class Student {
    private final UUID studentId;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Gender gender;

    public UUID getStudentId() {
        return this.studentId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public Gender getGender() {
        return this.gender;
    }

    // @Override
    // public boolean equals(Object o) {
    // if (o == this)
    // return true;
    // if (!(o instanceof Student)) {
    // return false;
    // }
    // Student student = (Student) o;
    // return Objects.equals(studentId, student.studentId) &&
    // Objects.equals(firstName, student.firstName)
    // && Objects.equals(lastName, student.lastName) && Objects.equals(email,
    // student.email)
    // && Objects.equals(gender, student.gender);
    // }

    // @Override
    // public int hashCode() {
    // return Objects.hash(studentId, firstName, lastName, email, gender);
    // }

    @Override
    public String toString() {
        return "{" + " studentId='" + getStudentId() + "'" + ", firstName='" + getFirstName() + "'" + ", lastName='"
                + getLastName() + "'" + ", email='" + getEmail() + "'" + ", gender='" + getGender() + "'" + "}";
    }

    public Student(UUID studentId, String firstName, String lastName, String email, Gender gender) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    enum Gender {
        MALE, FEMALE
    }
}