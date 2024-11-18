package com.pacer;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
   
    ArrayList<Student> studentList = new ArrayList<>();
    public void addAllStudents()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfStudents; i++) {
            Student student = new Student();
            student.enterStudentInfo();
            studentList.add(student);
        }
    }
    public void displayAllStudents()
    {
        for (Student student : studentList) {
            student.displayStudentInfo();
        }
    }  
    public void findStudentById(String idToFind)
    {
        for (Student student : studentlist) {
            if(student.studentId.equals(idToFind))
            {
                student.displayStudentInfo();
                return;
            }
        }
        System.out.println("Student with id " + idToFind + " not found.");
    }
    public boolean deleteStudentById(String idToDelete) {
       
        for (int i = 0; i < studentList.size(); i++) {
            if (studentlist.get(i).studentId.equals(idToDelete)) {
                studentlist.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean editStudentById(String idToEdit)
    {
        for (Student student : studentlist) {
            if(student.studentId.equals(idToEdit))
            {
                student.enterStudentInfo();
                return true;
            }
        }
        return false;
    }
}