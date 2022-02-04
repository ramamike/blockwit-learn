package com.blockwit.learn7.ramamike;
/* *****************************************************************************
Есть два массива. Первый 6,3,8,9 и второй 0,3,1,5. Вывести их на экран.
А затем создать такой массив, который вмещал бы первые два.
И скопировть в новый массив элементы первых двух массивов.
При этом элементы из первого и второго массивов должны чередоваться в новом.
Методами класса Arrays и другими готовыми,
которые вы сами не писали пользоваться запрещено.
 **************************************************************************** */

public class TaskS7T2 {
    public static void main(String[] args) {
        int[] arrN1 = {6,3,8,9};
        int[] arrN2 = {0,3,1,5};
        Helper obHelper = new Helper();

        System.out.print("Inserted array 1: \t");
        obHelper.printIntArray(arrN1);
        System.out.print("\nInserted array 2: \t");
        obHelper.printIntArray(arrN2);

        int lengthArrTotal = arrN1.length + arrN2.length;
        int[] arrTotal = new int[lengthArrTotal];
        for (int i=0; i<arrN1.length; i++)
            arrTotal[i]=arrN1[i];
        for (int i=arrN1.length; i<lengthArrTotal; i++)
            arrTotal[i]=arrN2[i-arrN1.length];

        System.out.print("\nTotal array: \t\t");
        obHelper.printIntArray(arrTotal);
    }
}