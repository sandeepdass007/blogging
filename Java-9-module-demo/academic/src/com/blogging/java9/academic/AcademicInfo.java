package com.blogging.java9.academic;

public class AcademicInfo {
    private String courseName;
    private Integer courseYear;
    private Integer courseSemester;

    public AcademicInfo() {
        super();
    }

    public AcademicInfo(String courseName, Integer courseYear, Integer courseSemester) {
        this.courseName = courseName;
        this.courseYear = courseYear;
        this.courseSemester = courseSemester;
    }

    public String getCourseName() {
        return courseName;
    }

    public Integer getCourseYear() {
        return courseYear;
    }

    public Integer getCourseSemester() {
        return courseSemester;
    }
}
