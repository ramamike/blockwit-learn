package com.blockwit.learn7.ramamike;

public class TaskS7T4_test {
    public static void main(String[] args) {
        ProtoList1 obProtoList1 = new ProtoList1();
        int size2=10;
        int [] myArr=obProtoList1.create(size2);
        for(int e : myArr) {
            System.out.print(" " +e);
        }
        for(int i=0; i <myArr.length; i++) {
            myArr[i]=i;
        }
        System.out.println();
        System.out.print(obProtoList1.getSize(myArr));
        System.out.println();
        for(int e : myArr) {
            System.out.print(" " +e);
        }
        System.out.println(obProtoList1.get(myArr, 8));
    }
}
