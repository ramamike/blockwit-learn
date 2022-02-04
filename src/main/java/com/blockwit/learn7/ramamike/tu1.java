package com.blockwit.learn7.ramamike;
/* *****************************************************************************
Задан массив чисел 12,7,89,-4,8,9. Необходимо:
1. Распечатать его.
2. Отсортировать его в порядке возрастания.
3. Распечатать еще раз.
Сделать класс Helper. Внутри него метод printIntArray.
Написать класс Utils. Внутри него метод sort.
 **************************************************************************** */

class Helper{
    void printIntArray(int[] arrInt) {
        for(int e : arrInt) System.out.print(" " + e);
    }
}
class Utils{
    void sortIntArray(int[] arrInt){
        for (int out = arrInt.length- 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(arrInt[in] > arrInt[in + 1]){
                    int temp=arrInt[in];
                    arrInt[in]=arrInt[in+1];
                    arrInt[in+1]=temp;
                }
            }
        }
    }
}


public class tu1 {
    public static void main(String[] args) {
        int[] arrN = {12, 7, 89, -4, 8, 9};
        Helper obHelper = new Helper();
        Utils obSort = new Utils();

        System.out.print("Inserted array: \t");
        obHelper.printIntArray(arrN);

        obSort.sortIntArray(arrN);
        System.out.print("\nSorted array: \t\t");
        obHelper.printIntArray(arrN);
    }
}