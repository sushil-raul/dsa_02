package dsa_02;

import java.util.Scanner;

class Studentt {
    int rollNumber;
    String name, course;

    void inputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        rollNumber = sc.nextInt();
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter course: ");
        course = sc.next();
    }

    void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

class Exam extends Studentt {
    int mark1, mark2, mark3;

    void inputMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter mark2: ");
        mark2 = sc.nextInt();
        System.out.print("Enter mark3: ");
        mark3 = sc.nextInt();
    }

    void displayResult() {
        System.out.println("Marks of " + name + ":");
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
    }
}

public class Q9 {
    public static void main(String[] args) {
        Exam[] exams = new Exam[5];
        for (int i = 0; i < 5; i++) {
            exams[i] = new Exam();
            exams[i].inputStudent();
            exams[i].inputMarks();
        }
        for (int i = 0; i < 5; i++) {
            exams[i].displayStudent();
            exams[i].displayResult();
        }
    }
}
