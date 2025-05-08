package com.apnacollage.java.basics;

import java.util.Scanner;

public class Basic {
    public static int num = 5;
    public static void hollowRectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a height of a rectangle: ");
        int h = sc.nextInt();
        System.out.print("Enter a length of a rectangle: ");
        int l = sc.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= l; j++) {
                if (i == 1 || i == h || j == 1 || j == l) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void patterns1(){
        char ch = 'A';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static int primeNo(int num){
        if (num == 2) {
            return num;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return num;
    }

    public static void areTherePrimeNo(int digit){
        if (digit < 2) {
            System.out.println("Smallest prime number is 2!");
            return;
        }
        while(digit >= 2){
            int myPrimeNo = primeNo(digit);
            if (myPrimeNo != 0) {
                System.out.print(myPrimeNo + " ");
            }
            digit--;
        }
    }
    public static void main(String[] args) {

        /*
        int age = 18;
        if (age >= 18) {
            System.out.println("You can vote");
        }
        if (age > 17 && age < 20) {
            System.out.println("You wust be in collage");
        }else{
            System.out.println("Sabh theek!");
        }
         */
//        hollowRectangle();
//        patterns1();
        areTherePrimeNo(10);

    }
}
