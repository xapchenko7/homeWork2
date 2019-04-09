package com.gmail.xapchenko2000;

import java.util.Scanner;

public class Main {

    static String name;
    static String city;
    static int age;
    static String hobby;

    public static void main(String[] args) {

        enterData();
        printOne();
        printTwo();
    }


    public static void enterData() {


        Scanner csOne = new Scanner(System.in);
        Scanner csHobby = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = csOne.nextLine();

        System.out.println("Enter your city where you were born: ");
        city = csOne.nextLine();

        System.out.println("Enter your age: ");
        age = csOne.nextInt();

        System.out.println("Enter your hobby: ");
        hobby = csHobby.nextLine();

    }

    public static void printOne() {
        System.out.println("Имя " + "    " + "\t" + name);
        System.out.println("Возраст " + "\t" + age);
        System.out.println("Город " + "  " + "\t" + city);
        System.out.println("Хобби " + "  " + "\t" + hobby);

    }

    public static void printTwo() {
        System.out.println("Человек по имени " + name + " " + "живет в городе " + city + " ");
        System.out.println("Этому человеку " + age + " " + " лет и любит он заниматься " + hobby + "ом");
    }
}
