package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Journal {

    ArrayList<Student> students = new ArrayList<>();
    int Avg = 0;
    Scanner in = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);
    Scanner in3 = new Scanner(System.in);
    public void AddStudent() {
        Student student = new Student( );
        System.out.println("Enter name ");
        student.setName(in.nextLine());
        System.out.println("============ ");
        System.out.println("Enter age ");
        student.setAge(in2.nextInt());
        System.out.println("============ ");
        System.out.println("Enter class ");
        student.setClassNumber(in3.nextLine());
        System.out.println("============ ");
        System.out.print("         ");
        students.add(student);

        System.out.println("Student added");
            };
    public void ShowStudents ()
    {
        for (Student value : students) {

            System.out.println("===============");
            System.out.println(value.getName() + "  "+ value.getAge() + "  " + value.getClassNumber());
            System.out.println("===============");
        }
    };
    public void AverageAgeOfStudents ()
    {
        System.out.println("Enter age of the oldest student");
        int AgeAvg = in.nextInt();
        int CountOfStudents = 0;
        for (Student student : students){
            if (student.getAge() <= AgeAvg) {
                CountOfStudents++;
                System.out.println("That's students get averaged");
                System.out.println(student.getName() + "  " + student.getAge() + "  " + student.getClassNumber());
                Avg = (Avg + student.getAge());

            }}
            Avg = Avg /CountOfStudents;
            System.out.println("Students average ages =" + Avg);
    }



}
