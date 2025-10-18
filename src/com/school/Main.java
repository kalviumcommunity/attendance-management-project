package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- School Administration & Attendance System ---");

        // --- Data Setup ---
        // We need to store our objects in Lists
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice Wonderland", "Grade 10")); // ID will be 1
        students.add(new Student("Bob The Builder", "Grade 9"));   // ID will be 2

        // Teacher/Staff are Persons, but not Storable (we didn't implement it)
        // So we'll skip saving them for now.

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Intro to Quantum Physics")); // ID C101
        courses.add(new Course("Advanced Algorithms"));     // ID C102

        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        // Use the getters to get the real, auto-generated IDs
        attendanceLog.add(new AttendanceRecord(students.get(0).getId(), courses.get(0).getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(students.get(1).getId(), courses.get(0).getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(students.get(0).getId(), courses.get(1).getCourseId(), "Present"));

        System.out.println("\n--- School Personnel & Course Details ---");
        // (Display logic removed for brevity, but you can keep it)

        // --- Saving Data ---
        System.out.println("\n--- Saving Data to Files ---");

        // 1. Create one instance of our service
        FileStorageService storageService = new FileStorageService();

        // 2. Use it to save all our different lists!
        storageService.saveData(students, "students.txt");
        storageService.saveData(courses, "courses.txt");
        storageService.saveData(attendanceLog, "attendance_log.txt");

        System.out.println("\nSession 6: Interface-Driven Persistence (Saving) Complete.");
        System.out.println("Check students.txt, courses.txt, and attendance_log.txt for output.");
    }
}