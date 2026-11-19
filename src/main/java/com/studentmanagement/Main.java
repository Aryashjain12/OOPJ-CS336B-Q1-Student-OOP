
package com.studentmanagement;

import com.studentmanagement.model.Student;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creating a list of skills
        List<String> skills = new ArrayList<>();

        skills.add("Java");
        skills.add("Python");
        skills.add("MySQL");

        // Creating Student object using parameterized constructor
        Student student = new Student(
                101,
                "Aryash Jain",
                "aryash@example.com",
                "B.Tech CSE",
                85.5,
                90.0,
                skills
        );

        // Display student details
        System.out.println("STUDENT PROFILE");
        System.out.println("-------------------------");
        System.out.println(student);

        // Updating student information using setter
        student.setProgrammingScore(92.0);

        // Adding a new technical skill
        student.addSkill("Cybersecurity");

        // Display updated details
        System.out.println("\nUPDATED STUDENT PROFILE");
        System.out.println("-------------------------");
        System.out.println(student);
    }
}
