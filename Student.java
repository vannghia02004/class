package com.pacer;
import java.util.Scanner;
public class Student {
    String studentId;
    String name;
    String className;
    String address;
    float gpa;
    
    public Student() {
    }
    
    public Student(String studentId, String name, String className, String address, float gpa) {
        this.studentId = studentId;
        this.name = name;
        this.className = className;
        this.address = address;
        this.gpa = gpa;
    }
    
    public void enterStudentInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        this.studentId = scanner.nextLine();
        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter Class: ");
        this.className = scanner.nextLine();
        System.out.print("Enter Address: ");
        this.address = scanner.nextLine();
        System.out.print("Enter GPA: ");
        this.gpa = scanner.nextFloat();
    }
    
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
        System.out.println("Address: " + address);
        System.out.println("GPA: " + gpa);
    }
}