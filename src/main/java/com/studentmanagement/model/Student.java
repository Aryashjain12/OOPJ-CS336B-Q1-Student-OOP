
package com.studentmanagement.model;

import java.util.ArrayList;
import java.util.List;

public class Student {

    // 1. Private data members (Encapsulation)
    private int studentId;
    private String studentName;
    private String emailAddress;
    private String courseName;
    private double programmingScore;
    private double mathematicsScore;
    private List<String> technicalSkills;

    // 2. Default constructor
    public Student() {
        this.technicalSkills = new ArrayList<>();
    }

    // 3. Parameterized constructor
    public Student(int studentId, String studentName,
                   String emailAddress, String courseName,
                   double programmingScore, double mathematicsScore,
                   List<String> technicalSkills) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.emailAddress = emailAddress;
        this.courseName = courseName;
        this.programmingScore = programmingScore;
        this.mathematicsScore = mathematicsScore;

        this.technicalSkills = technicalSkills != null
                ? new ArrayList<>(technicalSkills)
                : new ArrayList<>();
    }

    // 4. Getters and Setters

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getProgrammingScore() {
        return programmingScore;
    }

    public void setProgrammingScore(double programmingScore) {
        this.programmingScore = programmingScore;
    }

    public double getMathematicsScore() {
        return mathematicsScore;
    }

    public void setMathematicsScore(double mathematicsScore) {
        this.mathematicsScore = mathematicsScore;
    }

    public List<String> getTechnicalSkills() {
        return new ArrayList<>(technicalSkills);
    }

    public void setTechnicalSkills(List<String> technicalSkills) {
        this.technicalSkills = technicalSkills != null
                ? new ArrayList<>(technicalSkills)
                : new ArrayList<>();
    }

    // 5. Method to add a technical skill
    public void addSkill(String skill) {
        if (skill != null && !skill.trim().isEmpty()) {
            technicalSkills.add(skill);
        }
    }

    // 6. toString() method
    @Override
    public String toString() {
        return "Student {" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", courseName='" + courseName + '\'' +
                ", programmingScore=" + programmingScore +
                ", mathematicsScore=" + mathematicsScore +
                ", technicalSkills=" + technicalSkills +
                '}';
    }
}
