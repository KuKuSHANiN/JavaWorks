package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Integer choose;
        int CreateStudent = 1;
        Integer ShowAllJournal = 2;
        Integer Quite = 3;
        Integer AverageStudents = 4;
        Scanner in = new Scanner(System.in);

                Journal journal = new Journal();

        do {
            System.out.println("1 Create new Student");
            System.out.println("2 Show journal");
            System.out.println("3 Quite");
            System.out.println("4 Get average ages of students");
            System.out.print("Your choice: ");
            choose = in.nextInt();

            switch (choose) {
                case 1:

                    journal.AddStudent();
                    break;
                case 2:
                    System.out.println("This is a journal!");
                    System.out.println("***********************");
                    System.out.println("name     age     class");
                    journal.ShowStudents();
                                       break;
                case 3:
                    System.out.println("Finish!");
                    break;
                case 4:
                    journal.AverageAgeOfStudents();
                    break;
                default:
                    break;
            }
                    }
        while (!choose.equals(3));
        in.close();
    }
}
