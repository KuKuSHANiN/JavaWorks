package com.company;

import java.util.Scanner;

public class Student {
    private String name;
    private String age;
    private String classNumber;

    public Student() {
    }


    public void EnterTheName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter the name: ");
        name = in.nextLine();
    }
    public void EnterTheAge() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter the age: ");
        age = in.nextLine();

    }

    public void EnterTheClassNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter the class number: ");
        classNumber = in.nextLine();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String toString() {
        return name + " " + age + " " + classNumber;
    }
}