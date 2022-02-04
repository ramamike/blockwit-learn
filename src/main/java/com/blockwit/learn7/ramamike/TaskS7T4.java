package com.blockwit.learn7.ramamike;
/* *****************************************************************************
Написать класс ProtoList1 в котором будет поле array типа массив целых чисел.
Написать метод create который принимает размер и создает и присваивает полю
array пустой массив целых чисел указанного размера. Написать метод getSize
который возращает длину массива в поле array. Написать метод get, который
принимает индекс и возращает элемент из массива array по указанному индексу.
 **************************************************************************** */
class ProtoList1 {
    private int[] arr;

    int[] create(int size) {
        arr = new int[size];
        return arr;
    }
    int getSize(int [] array) {
        return array.length;
    }
    int get(int [] array, int i) {
        return array[i];
    }
}