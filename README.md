# Student Profile and Skill Development Management System

**Course:** OOPJ (CS336B)  
**Assessment:** MSE-2  
**Question:** Q1(a) – Student Class Using OOP Concepts  
**Language:** Java 21  
**Build Tool:** Maven  
**IDE:** IntelliJ IDEA

## 1. Problem Statement

Create a Student class to maintain student personal information, academic scores, and technical skills using Object-Oriented Programming concepts.

## 2. Student Attributes

| Attribute | Data Type |
|---|---|
| Student ID | int |
| Student Name | String |
| Email Address | String |
| Course Name | String |
| Programming Score | double |
| Mathematics Score | double |
| Technical Skills | List<String> |

## 3. Concepts Implemented

- **Encapsulation:** Private data members.
- **Constructors:** Default and parameterized constructors.
- **Getters and Setters:** Controlled access to student attributes.
- **Java Collections:** List<String> and ArrayList for storing technical skills.
- **Skill Addition:** addSkill() method.
- **Object Method:** Overridden toString() method for displaying student details.

## 4. Project Structure

```text
StudentSkillManagement/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── studentmanagement/
                    ├── Main.java
                    └── model/
                        └── Student.java
```

## 5. How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA.
3. Configure JDK 21.
4. Reload the Maven project.
5. Open Main.java.
6. Run the main() method.

## 6. Program Demonstration

The application demonstrates:

1. Creating a list of technical skills.
2. Creating a Student object using a parameterized constructor.
3. Displaying student information.
4. Updating the programming score using a setter.
5. Adding a new technical skill.
6. Displaying the updated student profile using toString().

### Sample Output

```text
STUDENT PROFILE
-------------------------
Student {studentId=101, studentName='Aryash Jain', emailAddress='aryash@example.com', courseName='B.Tech CSE', programmingScore=85.5, mathematicsScore=90.0, technicalSkills=[Java, Python, MySQL]}

UPDATED STUDENT PROFILE
-------------------------
Student {studentId=101, studentName='Aryash Jain', emailAddress='aryash@example.com', courseName='B.Tech CSE', programmingScore=92.0, mathematicsScore=90.0, technicalSkills=[Java, Python, MySQL, Cybersecurity]}
```

## 7. Scope

This repository covers **Q1(a) – Core Java and Object-Oriented Programming**.

The JDBC/MySQL implementation (Q2) and Spring Boot REST API implementation (Q3) are maintained as separate projects.

---

**Subject:** OOPJ (CS336B)  
**Case Study:** Student Profile and Skill Development Management System
