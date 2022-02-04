package com.blockwit.learn4.ramamike;

/* **************************************************************************
Написать программу, которая спрашивает температуру за последние три дня,
вычисляет среднюю температуру и выводит ее.
 * ************************************************************************** */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int lengthArr=3;
        Scanner console = new Scanner(System.in);
        double[] arrTemp = new double[lengthArr];
        double sum=0;
        System.out.println("Insert temperature per day:");
        for (int i = 0; i <lengthArr ; i++) {
            System.out.print("Day " + (i+1) + ": ");
            while (!console.hasNextDouble()) {
                System.out.println("Error input of TEMPERATURE, example is 3.4");
                System.out.print("Day " + (i + 1) + ": ");
                console.nextLine();
            }
            arrTemp[i]= console.nextDouble();
        }
        for (double e: arrTemp) sum+=e;

        System.out.println("Average temperature is: " + (sum/lengthArr));
    }
}
