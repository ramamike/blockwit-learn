package com.blockwit.learn7.ramamike;
/* *****************************************************************************
Есть два массива чисел. Первый - 9,1,5,6,8. И второй 7,3,1. Вывести их на экран.
Затем создать такой массив, который бы умещал первые два.
И скопировать туда элементы первых двух массивов.
Вывести получный массив на экран.
Методами класса Arrays и другими готовыми,
которые вы сами не писали пользоваться запрещено.
 **************************************************************************** */

public class TaskS7T1 {
    public static void main(String[] args) {
        int[] arrN1 = {9, 1, 5, 6, 8};
        int[] arrN2 = {7, 3, 1};
        Helper obHelper = new Helper();

        System.out.print("Inserted array 1: \t");
        obHelper.printIntArray(arrN1);
        System.out.print("\nInserted array 2: \t");
        obHelper.printIntArray(arrN2);

        int lengthArrTotal = arrN1.length + arrN2.length;
        int[] arrTotal = new int[lengthArrTotal];
        for (int i = 0; i < arrN1.length; i++)
            arrTotal[i] = arrN1[i];
        for (int i = arrN1.length; i < lengthArrTotal; i++)
            arrTotal[i] = arrN2[i - arrN1.length];
        System.out.print("\nTotal array: \t\t");
        obHelper.printIntArray(arrTotal);
    }
}