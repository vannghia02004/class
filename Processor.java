package com.pacer;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList studentList = new StudentList();
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Nhap vao thong tin sinh vien ");
            System.out.println("2. Hien thi thong tin tat ca sinh vien");
            System.out.println("3. Tim kiem sinh vien bang id");
            System.out.println("4. Xoa sinh vien bang id");
            System.out.println("5. Chinh sua sinh vien bang id");
            System.out.println("6. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    studentList.addAllStudents();
                    break;
                case 2:
                    studentList.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Nhap id sinh vien can tim: ");
                    String id = sc.next();
                    studentList.findStudentById(id);
                    break;
                case 4:
                    System.out.print("Nhap id sinh vien can xoa: ");
                    id = sc.next();
                    studentList.deleteStudentById(id);
                    break;
                case 5:
                    System.out.print("Nhap id sinh vien can chinh sua: ");
                    id = sc.next();
                    studentList.editStudentById(id);
                    break;
                case 6:
                    System.out.println("Da thoat.");
                    break;
                default:
                    System.out.println("Chon lai");
            }
        } while (choice != 6);

        sc.close();
    }
}