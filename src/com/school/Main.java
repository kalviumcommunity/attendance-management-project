package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- School Administration & Attendance System ---");

        // --- Creating School Personnel ---
        System.out.println("\n--- Creating School Personnel ---");
        // Note the new constructor for Student
        Student student1 = new Student("Alice Wonderland", "Grade 10");
        Student student2 = new Student("Bob The Builder", "Grade 9");
        // Create our new types of Person
        Teacher teacher1 = new Teacher("Dr. Emily Carter", "Physics");
        Staff staff1 = new Staff("Mr. John Davis", "Librarian");

        System.out.println("\n--- School Personnel Details ---");
        // These displayDetails() calls now use the overridden methods
        student1.displayDetails();
        student2.displayDetails();
        teacher1.displayDetails();
        staff1.displayDetails();

        // Course creation is unchanged
        Course course1 = new Course("Intro to Quantum Physics");
        System.out.println("\nAvailable Courses:");
        course1.displayDetails();


        // --- Attendance Recording (Modified to use Person's ID) ---
        System.out.println("\n--- Attendance Recording ---");
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // IMPORTANT: We now use student1.getId()
        // This method was INHERITED from Person!
        AttendanceRecord record1 = new AttendanceRecord(student1.getId(), course1.getCourseId(), "Present");
        attendanceLog.add(record1);

        // Test our validation with a new invalid status
        AttendanceRecord record2 = new AttendanceRecord(student2.getId(), course1.getCourseId(), "Daydreaming");
        attendanceLog.add(record2);

        System.out.println("\n--- Attendance Log ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }

        System.out.println("\nSession 5: Inheritance Hierarchy Established Complete.");
    }
}