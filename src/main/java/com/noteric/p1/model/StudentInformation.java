package com.noteric.p1.model;

import java.util.UUID;

public class StudentInformation {

    public String firstName;
    public String lastName;
    public String dateOfBirth;
    public int studentId;

    @Override
    public String toString() {
        return "StudentInformation{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
