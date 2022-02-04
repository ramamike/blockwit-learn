package com.blockwit.learn8.ramamike;

public class testClassMyIntArrayList {
    public static void main(String[] args) {
        MyIntArrayList myArrList = new MyIntArrayList();
        MyIntArrayList myArrList2 = new MyIntArrayList(0);
        MyIntArrayList myArrList3 = new MyIntArrayList(2);

        System.out.print("list default");
        myArrList.print();
        myArrList.add(1);
        System.out.print("\nlist default after add");
        myArrList.print();
        System.out.print("\nPrint the last added - index of array: " + myArrList.add(100) + " of " );
        myArrList.print();
        System.out.print("\nPrint with helper: ");
        PrintHelper obPrint = new PrintHelper();
        obPrint.printInList(myArrList);

        System.out.print("\nThe 2nd list:");
        myArrList2.print();
        myArrList2.add(1);
        System.out.print("\nThe 2rd after add");
        myArrList2.print();
        myArrList2.add(2);
        System.out.print("\nThe 2rd after add");
        myArrList2.print();
        myArrList2.add(3);
        System.out.print("\nThe 2rd after add");
        myArrList2.print();

        System.out.print("\nThe 3d list:");
        myArrList3.print();
        myArrList3.add(1);
        System.out.print("\nThe 3d list after add:");
        myArrList3.print();

        System.out.print("\n get: " + myArrList3.get(0));
        System.out.print("\n get: " + myArrList3.get(1));

        System.out.print("\n size arr2: " + myArrList2.size());

        myArrList3.clear();
        System.out.print("\n size and array3 after clearing: " + myArrList3.size() + ", ");
        myArrList3.print();
    }
}