package com.company;

public class Student {
    private String name;
    private String age;
    private String classNumber;

    public Student getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String toString() {
        return name + " " + age + " " + classNumber;
    }
}