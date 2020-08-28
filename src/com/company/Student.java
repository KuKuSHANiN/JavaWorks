package com.company;

import java.util.Scanner;

public class Student {
    private String name;
    private String age;
    private String classNumber;

    // TODO: для чего ты объявил пустой конструктор?
    public Student() {
    }


    // TODO: почему ты ответственность на ввод имени возложил на студента. Подумай чисто логически, какой класс должен отвечать за ввод данных
    //  и в каком месте программы этот ввод должен осуществляться. Если такого класса нет, то создай его
    public void EnterTheName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter the name: ");
        name = in.nextLine();
    }

    // TODO: то же замечание, что и для предыдущего метода
    public void EnterTheAge() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter the age: ");
        age = in.nextLine();

    }

    // TODO: то же замечание, что и для предыдущего метода
    public void EnterTheClassNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter the class number: ");
        classNumber = in.nextLine();
    }

    // TODO: метод не используется (подсказка: а должен!). Чтобы узнать, используется ли метод в программе, зажми ctrl, наведи курсор на название метода
    //  и когда метод будет подчеркнут, щелкни на него левой кнопкой мышки.
    //  Если результатов использования не выведется, значит метод не используется.
    //  А вообще, IDE подсвечивает серым цветом неиспользующиеся переменные, свойства и методы. Будь внимательнее.
    public String getName() {
        return name;
    }

    // TODO: метод не используется (подсказка: а должен!).
    public void setName(String name) {
        this.name = name;
    }

    // TODO: метод не используется (подсказка: а должен!).
    public String getAge() {
        return age;
    }

    // TODO: метод не используется (подсказка: а должен!).
    public void setAge(String age) {
        this.age = age;
    }

    // TODO: метод не используется (подсказка: а должен!).
    public String getClassNumber() {
        return classNumber;
    }

    // TODO: метод не используется (подсказка: а должен!).
    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String toString() {
        return name + " " + age + " " + classNumber;
    }
}