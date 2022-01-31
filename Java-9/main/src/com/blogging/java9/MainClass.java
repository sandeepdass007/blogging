package com.blogging.java9;

import com.blogging.java9.academic.AcademicInfo;
import com.blogging.java9.student.Student;

public class MainClass {

    public static void main(String[] args) {
        AcademicInfo academicInfo = new AcademicInfo("B.E.", 4, 1);
        Student student = new Student("Sandeep", "", "Dass", academicInfo);
        String message = student.getFirstName() + " " + student.getLastName() + " studying in " + academicInfo.getCourseName();
        System.out.println(message);
    }
}
