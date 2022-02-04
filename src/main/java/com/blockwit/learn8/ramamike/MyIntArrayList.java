package com.blockwit.learn8.ramamike;
/*
👉TaskS8T1 1. Написать класс MyIntArrayList. Этот класс будет представлять собой
список. Этот класс должен иметь методы:
add - добавляет элемент в конец списка. Возвращает индекс, по которому элемент
добавлен.
get - получает индекс и возвращает соответствующий индексу элемент.
size - возращает длину списка.
clear - очищает список

Важно: мы проходили список и знаем что он отличается от обычного массива тем,
что у него нет фиксированой заранее длины. Длина списка равна кол-ву элементов в нем.
Именно так должен работать Ваш список.

Вы уже писали ProtoList1 на базе массива. Но там у нас при очередном добавлении
массив мог переполнится. Ваша задача сделать так чтобы в новом списке такой
проблемы не было. На последнем семинаре я давал намек как это сделать и вроде
даже немного в коде показал. Но по возможности додумайтесь сами.
 */
public class MyIntArrayList {
    private int[] arrayInt;
    private int addInd;

    public MyIntArrayList() {
        arrayInt=new int[10];
        addInd=0;
    }

    public MyIntArrayList(int size) {
        if(size>1) {
            arrayInt=new int[size];
        } else {
            arrayInt=new int[1];
            System.out.println("\nWrong size of array, default value is set for size");
        }
        addInd=0;
    }

    public int add(int newInt) {
        if(addInd==arrayInt.length) {
            int newLength=(int)(((double)arrayInt.length)*1.5+1.0);
            int[] tempArr=new int[newLength];
            for(int i=0; i<arrayInt.length; i++) {
                tempArr[i]=arrayInt[i];
            }
            arrayInt=tempArr;
        }
        arrayInt[addInd++] = newInt;
        return addInd;
    }

    public int get(int index) {
        if(index>arrayInt.length-1) {
            System.out.println("Wrong index");
            return -1;
        }
        return arrayInt[index];
    }

    public int size() {
        return addInd;
    }

    public void clear() {
        for(int i=0; i<arrayInt.length; i++) {
            arrayInt[i] = 0;
            addInd = 0;
        }
    }

    void print() {
        for( int e : arrayInt) {
            System.out.print(" " + e);
        }
    }

}
