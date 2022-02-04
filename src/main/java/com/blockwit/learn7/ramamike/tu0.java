package com.blockwit.learn7.ramamike;
/* *****************************************************************************
Задан массив чисел 12,7,89,-4,8,9. Необходимо:
1. Распечатать его.
2. Отсортировать его в порядке возрастания.
3. Распечатать еще раз.
 **************************************************************************** */
public class tu0 {
    public static void main(String[] args) {
        int[] arrN={12,7,89,-4,8,9};
        int lengthArr=arrN.length;
        System.out.print("Inserted array: \t");
        for(int e : arrN) System.out.print(" " + e);

        for (int out = lengthArr- 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(arrN[in] > arrN[in + 1]){
                    int temp=arrN[in];
                    arrN[in]=arrN[in+1];
                    arrN[in+1]=temp;
                }
            }
        }
        System.out.print("\nSorted array: \t\t");
        for(int e : arrN) System.out.print(" " + e);
    }
}
