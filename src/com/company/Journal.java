package com.company;

import java.util.ArrayList;
import java.util.Scanner;

// TODO: Поработал с классом - отформатируй файл. ctrl + alt + l !!!
public class Journal {
    //TODO: обязательно указывай явно модификаторы доступа ВСЕМ свойствам.
    ArrayList<Student> students = new ArrayList<>();
    // TODO: Свойства в java  также пишут camelCase'ом, начиная с маленькой буквы. В данном случае: avg
    private int avg = 0;
    Scanner in = new Scanner(System.in);

    // TODO: Это шо за ферма сканеров?)) Вообще, как я и писал в Test класса, перенеси все, что связано с работой с консолью в main метод класса Test


    public void addStudent(Student student) {

        students.add(student);

        System.out.println("Student added");
    }

    ;

    public void ShowStudents() { // TODO: в java открывающуюся фигурную скобку принято ставить в той же строке, где и название метода. См. предыдущий метод. Там правильно
        // TODO: Чем более явно, тем лучше. Т.е, не value, а student
        int studentsCounts = 0;
        int studentsSumAge = 0;
        int smallVariableForAgeOfOneStud = 0;
        for (Student value : students) {
            smallVariableForAgeOfOneStud = value.getAge();

            studentsCounts++;
            studentsSumAge = studentsSumAge + smallVariableForAgeOfOneStud;
            System.out.println("===============");
            System.out.println(value.getName() + "  " + value.getAge() + "  " + value.getClassNumber());
            System.out.println("===============");

        }
        studentsSumAge = studentsSumAge / studentsCounts;
        System.out.println("Avg of student's age = " + studentsSumAge);
        System.out.println("===============");
    }

    ;

    public void getAverageAgeOfStudents() {
        // TODO: по заданию, сведний возраст студентов должен выводиться в методе выше, а не тут.
        // На месте этого метода реализуй функционал вывода списка студентов, возраст которых меньше введенного возраста с клавиатуры.
        // Т.е. этот метод должен получать на вход возраст, а на выхое выдавать список студентов. Ну, и конечно, переименуй метод)

        System.out.println("Enter age of the oldest student");
        int AgeAvg = in.nextInt();
        int CountOfStudents = 0;
        for (Student student : students) {
            if (student.getAge() <= AgeAvg) {
                CountOfStudents++;
                System.out.println(student.getName() + "  " + student.getAge() + "  " + student.getClassNumber());
                avg = (avg + student.getAge());

            }
        }
        System.out.println("That's students get averaged");
    }

    public void deleteStudent() {
        System.out.println("Enter name of removable student");
        String nameOfRemovableStud = in.nextLine();
        for (Student student : students) {
            if (student.getName().equals(nameOfRemovableStud)) {
                System.out.println("That student ? " + student.getName() + "   " + student.getAge() + "   " + student.getClassNumber());
                System.out.println("Y/N ? ");
                String answer = in.nextLine();
                if (answer.equals("Y")) {
                    students.remove(student);
                    break;
                }
                if (answer.equals("N")) {
                    System.out.println("No Student");
                    break;
                }

            }

        }

    }


}
