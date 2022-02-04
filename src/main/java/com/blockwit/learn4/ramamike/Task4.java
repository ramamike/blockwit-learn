package com.blockwit.learn4.ramamike;

/* **************************************************************************
 Написать программу, которая спрашивает, сколько у Вас друзей. А потом
 спрашивает имена этих друзей. Затем выводит имена друзей в обратном порядке.
 ************************************************************************** */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("How many friends? ");
        int lengthArr=console.nextInt();
        String[] arrNames = new String[lengthArr];
        console.nextLine();

        System.out.println("Insert names " + lengthArr + " times");
        for (int i = 0; i <lengthArr ; i++) {
            String name= console.nextLine();
            arrNames[i]=name;
        }
        System.out.print("Inserted friends: ");
        for (int i = lengthArr-1; i >= 0; i--) System.out.print(arrNames[i] + " ");
    }
}
