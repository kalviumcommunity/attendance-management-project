package com.school;

public class Student extends Person{
    // private int studentId;
    // private String name;
    // private static int nextStudentIdCounter = 1;
    private String gradeLevel;

    public Student(String name, String gradeLevel) {
    // this.studentId = nextStudentIdCounter++;
    super(name);
    this.gradeLevel = gradeLevel;
    }

    // public int getStudentId(){
    //     return this.studentId;
    // }

    // public String getName(){
    //     return this.name;
    // }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(", Grade Level: "+this.gradeLevel+" (Role: Student)");
    }
}