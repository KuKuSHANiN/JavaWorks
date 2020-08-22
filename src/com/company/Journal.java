package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Journal {

    ArrayList<Student> students = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    Student student = new Student();
    public void EnterTheName() {
        in = new Scanner(System.in);
        String name;
        System.out.print("Please, enter the name: ");
        name = in.nextLine();
        var student = new Student();
        student.setName(name);
    }

    public void EnterTheAge() {
        in = new Scanner(System.in);
        String age;
        System.out.print("Please, enter the age: ");
        age = in.nextLine();
        var student = new Student();
        student.setAge(age);
    }

    public void EnterTheClassNumber() {
        in = new Scanner(System.in);
        String ClassNumber;
        System.out.print("Please, enter the class number: ");
        ClassNumber = in.nextLine();
        var student = new Student();
        student.setAge(ClassNumber);
    }

    public void  AddNewStudentsInJournal() {
        Student mainNewStudent = new Student();
        students.add(mainNewStudent.getName());
        students.add(mainNewStudent.getAge());
        students.add(mainNewStudent.getClassNumber());
    }

    public void ShowAllStudents()
    {
        if (students.isEmpty()) {
            System.out.println("No students are here");
        } else {
            for (Student mainNewStudent: students) {
                System.out.println(mainNewStudent.getName() + "  " + mainNewStudent.getAge() + "  " + mainNewStudent.getClassNumber());
            }
        }
    }

}
