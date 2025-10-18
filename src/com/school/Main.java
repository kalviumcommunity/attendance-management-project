package com.school;  // Declares that this file belongs to the 'com.school' package.

public class Main{
    public static void main(String args[]){
        System.out.println("--- School Attendance System ---");

        // Using constructors for initialization
        System.out.println("\nCreating Students and Courses using Constructors:");

        // Notice how we create objects now. 'new' calls the constructor.
        // We pass the required arguments directly. No more setDetails()!
        Student student1 = new Student("Alice Wonderland");
        Student student2 = new Student("Bob The Builder");

        Course course1 = new Course("Intro to Programming");
        Course course2 = new Course("Linear Algebra");

        System.out.println("\nRegistered Students:");
        student1.displayDetails(); // Will have ID 1
        student2.displayDetails(); // Will have ID 2

        System.out.println("\nAvailable Courses:");
        course1.displayDetails(); // Will have ID C101
        course2.displayDetails(); // Will have ID C102

        // Demonstrate auto-ID generation with new instances
        System.out.println("\n--- Auto-ID Generation Test ---");
        System.out.println("Creating one more student and course...");

        // This proves the static counter is working.
        Student student3 = new Student("Charlie Chaplin");
        Course course3 = new Course("Data Structures");

        System.out.print("New Student: ");
        student3.displayDetails(); // Will have ID 3
        System.out.print("New Course: ");
        course3.displayDetails(); // Will have ID C103

        System.out.println("\nSession 3: Constructor Initialization & Auto-ID Generation Complete.");
    }
}