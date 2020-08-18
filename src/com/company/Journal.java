package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Journal {

    ArrayList<Student> students = new ArrayList<>();
    Scanner in = new Scanner(System.in);

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

    public void AddNewStudentsInJournal() {
        var student = new Student();
        students.add(student.getName());
        students.add(student.getAge());
        students.add(student.getClassNumber());
    }

    public void ShowAllStudents()
    {
        if (students.isEmpty()) {
            System.out.println("No students are here");
        } else {
            for (Student st : students) {
                System.out.println(st.getName() + "  " + st.getAge() + "  " + st.getClassNumber());
            }
        }
    }

}
