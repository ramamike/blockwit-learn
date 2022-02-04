package com.blockwit.learn4.ramamike;

/*****************************************************************************
 Написать программу, которая спрашивает у пользователя его год рождения и имя.
 Затем вычисляет сколько ему лет и выводит в формате:
 "<имя>, вам <кол-во_лет> лет"
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите год рождения: ");
        int year = console.nextInt();
        int age = 2022-year;

        console.nextLine();
        System.out.println("Введите имя: ");
        String name = console.nextLine();

        System.out.println(name + ", вам " + age + " лет.");
    }
}
