package com.blockwit.learn8.ramamike;

import java.util.Date;

/*
👉TaskS8T4 Найти как получить время в формате миллисекунд (unix timestamp).
 Написать класс ListsEvaluation , который содержит метод evalMyList. Который
 ринимает на вход пустой список из задачи 1. Затем наполняет список миллионом
 произвольных элементов и замеряет время за которое он это сделад.
 Затем выводит это время.
 */

/*
results:
    i=1         ->  22 ms;
    i=1000000   ->  39 ms:
    i = 0; i++  ->  26 ms
*/
public class ListEvaluation {
    private int testSize=1000000;

    public void evalMyList(MyIntArrayList arrList) {
        Date dateStart=new Date();
        long startStamp = dateStart.getTime();
        //Fill the MyArrayIntList with int values
        for (int i = 0; i < testSize; i++) {
            arrList.add(i);
        }
        Date dateEnd= new Date();
        long endStamp=dateEnd.getTime();
        System.out.println("\nTime evaluation in ms of MyIntArrayList is " + (endStamp-startStamp));
    }
}
