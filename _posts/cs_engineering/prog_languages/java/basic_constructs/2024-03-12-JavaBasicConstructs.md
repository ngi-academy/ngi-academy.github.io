---
layout: post
author: sheikirfanbasha
title: Java Basic Constructs
excerpt: Review Java syntax, data types, control flow, and basic language features.
comments: true
---
Let's explore the basic constructs of Java:
* Syntax
  * Class
    * Methods *(Main function)*
      * Statements
* Basic data types like int, String
* Writing output to the console
* Control flows
* Loop statements
* Functions

## Full Code
```java
public class NGIAcademyIntro {

    public static void main(String[] args) {
        // Example: Hello World in Java for NGI Academy
        System.out.println("Hello NGI Academy!");

        // Example: Variable declaration for student information
        String studentName = "John Doe";
        int studentAge = 20;

        // Example: Print student information
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);

        // Example: If-else statement for advanced/foundation course eligibility based on credits
        int studentCredits = 50;
        if (studentCredits >= 50) {
            System.out.println("Eligible for Advanced Course");
        } else {
            System.out.println("Eligible for Foundation Course");
        }

        // Example: For loop for course enrollment
        for (int i = 0; i < 3; i++) {
            System.out.println("Enroll student " + (i + 1));
        }

        // Example: Method to display student information
        displayStudentInfo(studentName, studentAge);
    }
    public static void displayStudentInfo(String name, int age) {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}
```