package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("1 Create new Student");
        System.out.println("2 Show journal");
        System.out.println("3 Quite");
        int choose = in.nextInt();
        ArrayList<String> One = new ArrayList<>();
        var n = 0;
        Student OneStud = new Student();
        var aN = OneStud.name;
        var aA = OneStud.age;
        var aK = OneStud.klass;
        do {
            switch (choose) {
                case 1:
                    System.out.println("Она вот тут");
                    var StudOne = new Student();
                    System.out.println("Она вот тут2");
                    System.out.println("Она вот тут3");
                    aN = in.nextLine();
                    aA = in.nextLine();
                    aK = in.nextLine();
                    One.add(aN);
                    One.add(aA);
                    One.add(aK);
                    One.add("|");
                    System.out.println(One);
                    break;
                case 2:
                    if (One.isEmpty()) {
                        System.out.println(One);
                        break;
                    } else break;
                case 3:
                    System.out.println("Eto karoche tipa vishel");
                    break;
                default:
                    break;
            }

        }
        while (choose != 3);
    }
}

class Student {
    public String name;
    public String age;
    public String klass;

    public Student() {
        // name = n;
        // age = a;
        //klass = k;

    }

    public String name() {
        System.out.println("Name pls");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public int age() {
        System.out.println("Age pls");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public int klass() {
        System.out.println("Klass pls");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}

// write your code here

