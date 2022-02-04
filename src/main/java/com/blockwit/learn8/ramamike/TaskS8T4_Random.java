package com.blockwit.learn8.ramamike;

import java.util.Random;

/*👉TaskS9T3 Найти как генерировать произвольное целое число. Сгенерированные
 числа добавить в список созданный на основе класса из первой задачи.
  Распечатать с помощью метода из задачи 2.*/
public class TaskS8T4_Random {
    public static void main(String[] args) {
        Random r = new Random();
        MyIntArrayList arrList = new MyIntArrayList(20);
        PrintHelper obPrint = new PrintHelper();

        //Fill the MyArrayIntList with a random int value
        for (int i = 0; i < 22; i++) {
            int x= r.nextInt(100);
            arrList.add(x);
        }

        System.out.println("\n Print random array list: ");
        obPrint.printInList(arrList);
    }
}
