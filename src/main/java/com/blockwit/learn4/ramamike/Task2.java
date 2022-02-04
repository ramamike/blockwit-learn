package com.blockwit.learn4.ramamike;

/* **************************************************************************
 Написать программу, которая спрашивает у пользователя 5 имен.
 А затем выводит все эти имена.
 ************************************************************************** */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int lengthArr=5;
        Scanner console = new Scanner(System.in);
        String[] arrNames = new String[lengthArr];

        System.out.println("Insert names " + lengthArr + " times");
        for (int i = 0; i <lengthArr ; i++) {
            String name= console.nextLine();
            arrNames[i]=name;
        }
        System.out.print("Inserted names: ");
        for(String e : arrNames) System.out.print(e +" ");
    }
}
