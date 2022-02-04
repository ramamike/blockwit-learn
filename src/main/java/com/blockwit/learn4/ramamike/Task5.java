package com.blockwit.learn4.ramamike;

/* **************************************************************************
 Написать программу, которая спрашивает у пользователя четыре числа.
 А затем меняет местами первое и последнее число и выводит все числа.
 * ************************************************************************** */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int lengthArr=4;
        int temp;
        int[] arrayNumbers= new int[lengthArr];
        System.out.println("Insert 4 numbers ");
        for (int i = 0; i <lengthArr ; i++) {
            int n= console.nextInt();
            arrayNumbers[i]=n;
        }
        System.out.print("Numbers before: \t");
        for(int e: arrayNumbers) System.out.print(e + " ");

        temp=arrayNumbers[0];
        arrayNumbers[0]=arrayNumbers[lengthArr-1];
        arrayNumbers[lengthArr-1]=temp;
        System.out.print("\nNumbers after: \t\t");
        for(int e: arrayNumbers) System.out.print(e + " ");
    }
}
