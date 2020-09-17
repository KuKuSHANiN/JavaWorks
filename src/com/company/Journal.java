package com.company;

import java.util.ArrayList;
import java.util.Scanner;
// TODO: Поработал с классом - отформатируй файл. ctrl + alt + l !!!
public class Journal {
    //TODO: обязательно указывай явно модификаторы доступа ВСЕМ свойствам.
    ArrayList<Student> students = new ArrayList<>();
    // TODO: Свойства в java  также пишут camelCase'ом, начиная с маленькой буквы. В данном случае: avg
    int Avg = 0;

    // TODO: Это шо за ферма сканеров?)) Вообще, как я и писал в Test класса, перенеси все, что связано с работой с консолью в main метод класса Test
    Scanner in = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);
    Scanner in3 = new Scanner(System.in);
    public void AddStudent() {
        Student student = new Student( ); // TODO: а почему не 20 пробелов в скобках? :D:D:D:D:D
        System.out.println("Enter name ");
        student.setName(in.nextLine());
        System.out.println("============ ");
        System.out.println("Enter age ");
        student.setAge(in2.nextInt());
        System.out.println("============ ");
        System.out.println("Enter class ");
        student.setClassNumber(in3.nextLine());
        System.out.println("============ ");
        System.out.print("         ");
        students.add(student);

        System.out.println("Student added");
            };
    public void ShowStudents ()
    { // TODO: в java открывающуюся фигурную скобку принято ставить в той же строке, где и название метода. См. предыдущий метод. Там правильно
        // TODO: Чем более явно, тем лучше. Т.е, не value, а student
        for (Student value : students) {

            System.out.println("===============");
            System.out.println(value.getName() + "  "+ value.getAge() + "  " + value.getClassNumber());
            System.out.println("===============");
        }


    };

    public void AverageAgeOfStudents ()
    {
        // TODO: по заданию, сведний возраст студентов должен выводиться в методе выше, а не тут.
        // На месте этого метода реализуй функционал вывода списка студентов, возраст которых меньше введенного возраста с клавиатуры.
        // Т.е. этот метод должен получать на вход возраст, а на выхое выдавать список студентов. Ну, и конечно, переименуй метод)

        System.out.println("Enter age of the oldest student");
        int AgeAvg = in.nextInt();
        int CountOfStudents = 0;
        for (Student student : students){
            if (student.getAge() <= AgeAvg) {
                CountOfStudents++;
                System.out.println("That's students get averaged");
                System.out.println(student.getName() + "  " + student.getAge() + "  " + student.getClassNumber());
                Avg = (Avg + student.getAge());

            }}
            Avg = Avg /CountOfStudents;
            System.out.println("Students average ages =" + Avg);
    }



}
