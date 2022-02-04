package com.blockwit.learn4.ramamike;

/* **************************************************************************
Написать программу, которая спрашивает имена и года рождения 4 людей.
После этого выводит имена и кол-во лет.
 ************************************************************************** */

import java.util.Scanner;

public class Task2_ {
    public static void main(String[] args) {
        int lengthArr=4;
        Scanner console = new Scanner(System.in);
        String[] arrNames = new String[lengthArr];
        int [] arrAge = new int[lengthArr];

        System.out.println("Insert names and years of birth " + lengthArr + " times");
        for (int i = 0; i <lengthArr ; i++) {
            System.out.print("name: ");
            String name = console.nextLine();
            arrNames[i] = name;

            System.out.print("\t year: ");
            while (!console.hasNextInt()) {
            System.out.println("Error input of year");
            System.out.print("\t year: ");
            console.nextLine();
            }
            int year= console.nextInt();
            arrAge[i]=2022-year;
            console.nextLine();
        }
        System.out.println("Inserted: ");
        console.close();
        for (int i = 0; i < lengthArr; i++) {
            System.out.println(arrNames[i] + " is " + arrAge[i] + " old");
        }
    }
}
