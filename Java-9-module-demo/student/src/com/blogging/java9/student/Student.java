package com.blogging.java9.student;

import com.blogging.java9.academic.AcademicInfo;

public class Student {

    private String firstName;
    private String middleName;
    private String lastName;
    // AcademicInfo is in module com.blogging.java9.academic
    // Hence, it should export and this module should require it
    private AcademicInfo academicInfo;

    public Student() {
        super();
    }

    public Student(String firstName, String middleName, String lastName, AcademicInfo academicInfo) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.academicInfo = academicInfo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public AcademicInfo getAcademicInfo() {
        return academicInfo;
    }
}
