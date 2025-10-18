package com.school;

public class Course{
    private static int nextCourseIdCounter=101;
    int courseId;
    String courseName;

    public void setDetails(String cName){
        this.courseId = nextCourseIdCounter++;
        this.courseName = cName;
    }

    public void displayDetails(){
        System.out.println("Course ID: C"+this.courseId+", Name: "+ this.courseId);
    }
}