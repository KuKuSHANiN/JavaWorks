package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Journal {

    ArrayList<String> students = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    Student OneStudent = new Student();

    public void AddNewStudentsInJournal() {
        OneStudent.EnterTheName();
        OneStudent.EnterTheAge();
        OneStudent.EnterTheClassNumber();
     }
    }
