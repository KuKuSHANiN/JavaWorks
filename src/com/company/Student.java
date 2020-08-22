package com.company;

public class Student {
    public String name;
    public String age;
    publicgit commit -m "[your message]" String classNumber;

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