package com.blockwit.learn4.ramamike;

/* ***************************************************************************
Написать программу, которая спрашивает у пользователя четыре числа.
А затем меняет местами первое и последнее число только,
если последнее больше первого. Затем выводит числа.
 * ************************************************************************* */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int lengthArr=4;
        int temp;
        int[] arrN= new int[lengthArr];
        System.out.println("Insert 4 numbers ");
        for (int i = 0; i <lengthArr ; i++) {
            int n= console.nextInt();
            arrN[i]=n;
        }
        System.out.print("Numbers before: \t");
        for(int e: arrN) System.out.print(e + " ");

        if(arrN[lengthArr-1]>arrN[0]) {
            temp = arrN[0];
            arrN[0] = arrN[lengthArr - 1];
            arrN[lengthArr - 1] = temp;
        }
        System.out.print("\nNumbers after: \t\t");
        for(int e: arrN) System.out.print(e + " ");
    }
}
