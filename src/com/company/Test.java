package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Integer choose;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("1 Create new Student");
            System.out.println("2 Show journal");
            System.out.println("3 Quite");
            System.out.print("Your choice: ");
            choose = in.nextInt();

            switch (choose) {
                case 1:
                    in = new Scanner(System.in);
                    String name;
                    System.out.print("Please, enter the name: ");
                    name = in.nextLine();
                    System.out.print("Please, enter the age: ");
                    var age = in.nextLine();
                    System.out.print("Please, enter the class number: ");
                    var classNumber = in.nextLine();

                    var student = new Student();
                    student.setAge(age);
                    student.setName(name);
                    student.setClassNumber(classNumber);

                    students.add(student);
                    break;
                case 2:
                    System.out.println("This is a journal!");
                    System.out.println("***********************");
                    System.out.println("name     age     class");
                    if (students.isEmpty()) {
                        System.out.println("No students are here");
                    } else {
                        for (Student st : students) {
                            System.out.println(st.getName() + "  " + st.getAge() + "  " + st.getClassNumber());
                        }
                    }
                    System.out.println("***********************");
                    break;
                case 3:
                    System.out.println("Finish!");
                    break;
                default:
                    break;
            }

            for (int i = 0; i < 50; ++i) System.out.println();

        }
        while (!choose.equals(3));

        in.close();
    }
}
