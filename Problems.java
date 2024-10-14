import java.util.*;
import java.lang.*;

// public class Problems {

// public static void main(String[] args) {

// }

// }

/*
 * Question1:In a program,input 3 numbers: A, B and C.You have to out put the
 * average of these 3 numbers.(Hint : Average of N numbers is sum of those
 * numbers divided by N)
 */

// public class Problems {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter 1st number");
// int num1 = sc.nextInt();
// System.out.println("Enter 2nd number");
// int num2 = sc.nextInt();
// System.out.println("Enter 3rd number");
// int num3 = sc.nextInt();
// sc.close();
// float average = ((num1+num2+num3)/3f);
// System.out.println("Average of "+ num1 + " and " + num2 + " and " + num3 + "
// is " + average);
// }

// }

// ................................................................................

/*
 * Question2:In a program,input the side of a square.You have to out put the
 * area of the square.(Hint : area of a square is (side x side))
 */

// public class Problems {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter side of a square");
// int side = sc.nextInt();
// sc.close();
// int area = side * side;
// System.out.println("Area of a square with side " + side + "cm is " + area +
// "cm^2");
// }

// }

// ................................................................................

/*
 * Question3:Enter cost of 3 items from the user (using float datatype)-a
 * pencil,a pen and an eraser. You have to output the total cost of the items
 * back to the user as their bill.(Add on : You can also try adding 18% gst tax
 * to the items in the bill as an advanced problem)
 */

public class Problems {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cose of Pencil");
        float pencil = sc.nextFloat();
        System.out.println("Enter cose of Pen");
        float pen = sc.nextFloat();
        System.out.println("Enter cose of Eraser");
        float eraser = sc.nextFloat();

        float total_item_price = pencil + pen + eraser;
        System.out.println("Total item price is: " + total_item_price);

        float tax = total_item_price * 0.18f;
        float total_item_price_with_tax = total_item_price + tax;

        System.out.println("Total item price with 18% GST is: " + total_item_price_with_tax);

    }

}

// ................................................................................

/*
 * Question4: What will be the type of result in thefollowing Java code?
 * byte b = 4;
 * char c = 'a';
 * short s = 512;
 * int i = 1000;
 * float f = 3.14f;
 * double d = 99.9954;
 * result = (f*b) + (i%c) - (d*s);
 */

// Answer: The result variable will be of double type because oftype conversion.

// ................................................................................

/*
 * Question 5:(Advanced)Will the following statement give any error in
 * Java ? int $ = 24;
 */

// public class Problems {

// public static void main(String[] args) {
// int $my = 5;
// System.out.println($my);
// }

// }

// No, the statement will not give any
// error.NamesofvariablesarecalledidentifiersinJava.Identifierrulesays,identifierscanstartwithany
// alphabet or underscore (“_”) or dollar (“$”).According to the rule the given
// variable name is a valid identifier.

// ................................................................................