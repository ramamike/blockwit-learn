package com.blockwit.learn7.ramamike;
/* *****************************************************************************
Есть два массива. Первый 7,4,2,8,6,7 и второй 6,2,9. Вывести их на экран.
А затем создать такой массив, который вмещал бы первые два.
И скопировать в новый массив элементы первых двух массивов.
При этом элементы из первого и второго массивов должны чередоваться в новом
массиве. Если в какой-то момент из-за нехватки элементов в одном из массивов
чередовать будет нельзя, то копировать элементы из оставшегося массива.
 **************************************************************************** */

public class TaskS7T3 {
    public static void main(String[] args) {
        int[] arrN1 = {7,4,2,8,6,7};
        int[] arrN2 = {7,4,2};
        Helper obHelper = new Helper();

        System.out.print("Inserted array 1: \t");
        obHelper.printIntArray(arrN1);
        System.out.print("\nInserted array 2: \t");
        obHelper.printIntArray(arrN2);

        int length1=arrN1.length;
        int length2=arrN2.length;
        int base;

        int lengthT=length1+length2 ;
        int[] arrTotal = new int[lengthT];

        if (length1>length2) {
            base=length2;
        } else {
            base=length1;
        }

        for (int i = 0, j=0; i <base; i++, j+=2) {
            arrTotal[j] = arrN1[i];
            arrTotal[j+1]=arrN2[i];
        }
        for (int i=base, j=base*2; j <lengthT; i++,j++ ) {
            if(length1>length2) {
                arrTotal[j] = arrN1[i];
            }
            else {
                arrTotal[j] = arrN2[i];
            }
        }

        System.out.print("\nTotal array: \t\t");
        obHelper.printIntArray(arrTotal);
    }
}