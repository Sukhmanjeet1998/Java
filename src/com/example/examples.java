package com.example;

import java.util.Map;

public class examples {
    public static void main(String[] args) {
//        int a = 1;
//        int c = a + ++a;
//        int d = ++a + a;
//        System.out.println(c);
//        System.out.println(d);

//        int a = 5;
//        System.out.println(a);
//        System.out.println(Integer.toBinaryString(a));
//        int b = a >> 1;
//        System.out.println(b);
//        System.out.println(Integer.toBinaryString(b));
//        b = b << 1;
//        System.out.println(b);
//        System.out.println(Integer.toBinaryString(b));

//        Map<String, String> getenv = System.getenv();
//        System.out.println("Hello");

//        Important 1
/*
        String x = "Ram";
        String a = new String(x);
        String b = new String(x);
        String c = "Ram";
        String d = "Ram";
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(c == x);

        d = "Shyam" ;
        System.out.println(c == d);
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
        System.out.println("X: " + x);

        System.out.println(System.identityHashCode(a)); // Unique hash for a’s object
        System.out.println(System.identityHashCode(b)); // Different hash for b’s object
        System.out.println(System.identityHashCode(x)); // Same hash as c and d
        System.out.println(System.identityHashCode(c)); // Same hash as x and d
        System.out.println(System.identityHashCode(d)); // Same hash as x and c

 */

//        We are checking reference in string not values

/*
         String myName = "Krishan Sharma";
         int length = myName.length();
         char c = myName.charAt(length-1);
         String name2 = "Krishan Sharma";
         boolean isEqual = myName.equals(name2);
        System.out.println(isEqual);
 */
        /*
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
         */
/*
        int [][] arr = {{1,2,3},{4,5,6,7},{8,9}};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

 */

//        Important 2
/*
        Cat c1 = new Cat();
        c1.name = "tom";
        makeCatNameUpperCase(c1);
        System.out.println(c1.name);
 */

   }

   /*
    public static void makeCatNameUpperCase(Cat cat){
        cat.name = cat.name.toUpperCase();
        System.out.println("Cat: " + cat);
        System.out.println(cat.name);
    }
    */


}
