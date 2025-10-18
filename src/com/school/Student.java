package com.school;

public class Student{
    int studentId;
    String name;
    private static int nextStudentIdCounter = 1;

    public void setDetails(String studentName){
        this.studentId = nextStudentIdCounter++;
        this.name = studentName;
    }

    public void displayDetails(){
        System.out.println("Student ID: "+this.studentId+", Name: "+ this.name);
    }
}