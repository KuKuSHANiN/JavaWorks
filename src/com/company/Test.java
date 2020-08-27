package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Integer choose;
        Scanner in = new Scanner(System.in);
        Journal StudentOnTurn = new Journal();
        do {
            System.out.println("1 Create new Student");
            System.out.println("2 Show journal");
            System.out.println("3 Quite");
            System.out.print("Your choice: ");
            choose = in.nextInt();

            switch (choose) {
                case 1:
                    StudentOnTurn.AddNewStudentsInJournal();
                    break;
                case 2:
                    System.out.println("This is a journal!");
                    System.out.println("***********************");
                    System.out.println("name     age     class");
                    students.add(StudentOnTurn.OneStudent);
                    if (students.isEmpty()) {
                        System.out.println("No students are here");
                    } else {
                        for (Student st: students) {
                            System.out.println(st);
                        }
                    System.out.println("***********************");}
                    break;
                case 3:
                    System.out.println("Finish!");
                    break;
                default:
                    break;
            }

            for (int i = 0; i < 10; ++i) System.out.println();

        }
        while (!choose.equals(3));
        in.close();
    }
}
