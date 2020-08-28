package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Journal {

    // TODO: 1. Где модификатор доступа? (Подсказка: запомни, доступ к свойствам должен предоставляться с помощью методов
    //          т.е. войства должны быть в данном случае объявлены как private. Прочитай про инкапсуляцию: https://vertex-academy.com/tutorials/ru/inkapsulyaciya-java/
    //       2. Свойство объявлено и инициализировано, но НИГДЕ НЕ ИСПОЛЬЗУЕТСЯ (подсказка: а должно!)
    ArrayList<String> students = new ArrayList<>();

    // TODO: 1. Где модификатор доступа?
    Scanner in = new Scanner(System.in);

    // TODO: 1. Где модификатор доступа?
    Student OneStudent = new Student();

    public void AddNewStudentsInJournal() {
        OneStudent.EnterTheName();
        OneStudent.EnterTheAge();
        OneStudent.EnterTheClassNumber();
     }
    } // TODO: корявое форматирование строк - плохо. ctrl+alt+l  - автоформатирование. Пользуйся чаще.
