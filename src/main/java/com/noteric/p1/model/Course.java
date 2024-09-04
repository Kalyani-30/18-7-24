package com.noteric.p1.model;

public class Course {

    public String courseName;
    public String level;
    public String language;
    public String startDate;

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", level='" + level + '\'' +
                ", language='" + language + '\'' +
                ", startDate='" + startDate + '\'' +
                '}';
    }
}
