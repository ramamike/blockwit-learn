package com.blockwit.learn8.ramamike;
/*
👉TaskS8T2 2. Добавить в PrintHelper метод printInList, который бы распечатывал
все числа списка из задачи 1.
*/
public class PrintHelper {
    public void printIntArr(int[] arrInt) {
        for(int e : arrInt) System.out.print(" " + e);
    }

    public void printInList(MyIntArrayList ob) {
        for( int i=0; i<ob.size(); i++) {
            System.out.print(ob.get(i) + " ");
        }
    }

}
