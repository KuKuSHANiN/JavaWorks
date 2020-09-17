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
        int CreateStudent = 1;
        Integer ShowAllJournal = 2;
        Integer Quite = 3;
        Integer AverageStudents = 4;
        Scanner in = new Scanner(System.in);

        // TODO: Шо за отступ такой? Всегда форматируй код! Это выдаст в тебе дилетанта. ctrl + alt + l
                Journal journal = new Journal();

        do {
            System.out.println("1 Create new Student"); // (!)
            System.out.println("2 Show journal"); // (!)
            System.out.println("3 Quite"); // (!)
            System.out.println("4 Get average ages of students"); // (!)
            System.out.print("Your choice: ");
            choose = in.nextInt();

            // TODO: логику получения данных с консоли нужно перенести из класса journal сюда, в switch case.
            //  Представь, что мы будем получать данные о полявлении нового студента не только из консоли, но и, к примеру из telegram?
            //  Сечешь?) Методы journal должны работать со студентами и неавжно, откуды они поступают, будь то из консоли или из другого источника.
            //  А если оставить так, как написал ты, то ты тупо не сможешь расширять функционал своего приложения.
            //  Отпиши мне в вк, если понял, и, тем более, если не понял.
            switch (choose) {
                case 1: // (!)

                    // TODO: создавай студенто тут и передавай их в метод AddStudent. Это касается всех методов journal в этом switch case
                    journal.AddStudent(); // TODO: названия методов в java также пишут camelCase'ом, например, addStudent, начиная с маленькой буквы.
                    break;
                case 2: // (!)
                    System.out.println("This is a journal!");
                    System.out.println("***********************");
                    System.out.println("name     age     class");
                    journal.ShowStudents();
                                       break;
                case 3: // (!)
                    System.out.println("Finish!");
                    break;
                case 4: // (!)
                    journal.AverageAgeOfStudents(); // TODO: названия методов ВСЕГДА должны начинаться с глагола. Например, getAverageAgeOfStudents
                    break;
                default:
                    // TODO: Где обработка исключительного случая, когда пользователь ввел несуществующую команду? Как минимум, пользователю нужно сообщить об этом))
                    break;
            }
                    }
        while (!choose.equals(3)); // (!)
        in.close();
    }
}
