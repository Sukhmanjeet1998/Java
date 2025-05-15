package com.apnacollage.java.basics;

public class Array {

    public static void linearSearch(int[] myArr){
        int myNum = 97000;
        boolean isFind = false;
        for (int i = 0; i < myArr.length ; i++) {
            if (myArr[i] == myNum) {
                isFind = true;
                break;
            }
        }
        if (isFind) {
            System.out.println("Value exist");
        }
        else{
            System.out.println("Can't Find");
        }
    }

    public static void largestNumber(int[] myArr){
        int lar = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] > lar) {
                lar = myArr[i];
            }
            if (small > myArr[i]) {
                small = myArr[i];
            }
        }
        System.out.println("Largest: " + lar);
        System.out.println("Smallest: " + small);

    }

    public static void binarySearch(int[] myArr){
        int num = 21;
        int start = 0;
        int end = myArr.length - 1;
        while (start <= end){
            int mid = ((start + end) / 2);
            if (myArr[mid] == num) {
                System.out.println("Found");
                return;
            }else if (myArr[mid] > num) {
                end = mid;
            }else{
                start = mid;
            }
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) {

        binarySearch(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20});







        //        int[] myList = {2221,12,53,641,85,64,77,89,9700};
//        linearSearch(myList);
//        largestNumber(myList);


    }
}
