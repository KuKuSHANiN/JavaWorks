package com.company;

//TODO: не захламляй код неиспользуемыми данными. Удаляй неиспользуемые импорты.

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Integer choose;

        // TODO:
        //  1. Шо за нах??? Это локальные переменные, а не константы класса! Прочитай, чем локальыне переменные отличаются от свйств класса.
        //  И прочитай, что такое константы класса и чем они отличаются от свойств класса. В данном случае, тебе нужно использовать именно константы класса.
        //  И, да, запомни, что константы пишутся upper case'ом, и если в несколько слов, то через _. Например, CREATE_STUDENT
        //  2. Переменные в java пишут camelCase'ом, например, createStudent, начиная с маленькой буквы.
        //  3. Почему в первом случае у тебя int, а в остальный Integer? Ты уж определись))
        //  4. И, вишенка на торте: ОНИ, БЛЯ, НЕ ИСПОЛЬЗУЮТСЯ У ТЕБЯ В КОДЕ :D :D. Заиспользуй их везде, где (!)
        final int CREATE_STUDENT = 1;
        final int SHOW_ALL_JOURNAL = 2;
        final int QUITE = 3;
        final int AVERAGE_AGE_OF_STUDENTS = 4;
        final int DELETE_STUDENT = 5;

        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);

        // TODO: Шо за отступ такой? Всегда форматируй код! Это выдаст в тебе дилетанта. ctrl + alt + l
        Journal journal = new Journal();

        do {
            System.out.println("1 Create new Student"); // (!)
            System.out.println("2 Show journal"); // (!)
            System.out.println("3 Quite"); // (!)
            System.out.println("4 Get average ages of students");
            System.out.println("5 Delete students out of journal"); // (!)
            System.out.print("Your choice: ");
            choose = in.nextInt();

            // TODO: логику получения данных с консоли нужно перенести из класса journal сюда, в switch case.
            //  Представь, что мы будем получать данные о полявлении нового студента не только из консоли, но и, к примеру из telegram?
            //  Сечешь?) Методы journal должны работать со студентами и неавжно, откуды они поступают, будь то из консоли или из другого источника.
            //  А если оставить так, как написал ты, то ты тупо не сможешь расширять функционал своего приложения.
            //  Отпиши мне в вк, если понял, и, тем более, если не понял.
            switch (choose) {
                case CREATE_STUDENT: // (!)
                    Student student = new Student(); // TODO: а почему не 20 пробелов в скобках? :D:D:D:D:D
                    System.out.println("Enter name ");
                    student.setName(in.next());
                    System.out.println("============ ");
                    System.out.println("Enter age ");
                    student.setAge(in.nextInt());
                    System.out.println("============ ");
                    System.out.println("Enter class ");
                    student.setClassNumber(in.nextInt());
                    System.out.println("============ ");
                    System.out.print("         ");
                    // TODO: создавай студенто тут и передавай их в метод AddStudent. Это касается всех методов journal в этом switch case
                    journal.addStudent(student); // TODO: названия методов в java также пишут camelCase'ом, например, addStudent, начиная с маленькой буквы.
                    break;
                case SHOW_ALL_JOURNAL: // (!)
                    System.out.println("name     age     class");
                    journal.ShowStudents();
                    break;
                case QUITE: // (!)
                    System.out.println("Finish!");
                    break;
                case AVERAGE_AGE_OF_STUDENTS: // (!)
                    journal.getAverageAgeOfStudents(); // TODO: названия методов ВСЕГДА должны начинаться с глагола. Например, getAverageAgeOfStudents
                    break;
                case DELETE_STUDENT: // (!)
                    journal.deleteStudent(); // TODO: названия методов ВСЕГДА должны начинаться с глагола. Например, getAverageAgeOfStudents
                    break;
                default:

                    System.out.println("Please enter correct position mothe****er!");
                    // TODO: Где обработка исключительного случая, когда пользователь ввел несуществующую команду? Как минимум, пользователю нужно сообщить об этом))
                    break;
            }
        }
        while (!choose.equals(3)); // (!)
        in.close();
    }
}
