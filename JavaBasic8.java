import java.util.*;

public class JavaBasic8 {

    // method1
    public static void message() {
        System.out.println("Hello Function");
        return;
    }

    // method2   
    public static int sum(int num1, int num2) {  // formal parameters 
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a , int b){
        // Call by value
        int temp = b;
        b = a;
        a = temp;
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);
    }

    public static int product(int a, int b){
        return a*b;
    }

    public static int factorial(int value){
        int val  = 1;
        while (value >= 1) {
            val = val * value;
            value--;
        }
        return val;
    }

    // main method
    public static void main(String args[]) {
        int a = 3;
        int b = 4;

        message();

        int sum = sum(5, 5);  // arguments or actual parameters
        System.out.println(sum);

        swap(a, b);
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);

        System.out.println("Product of " + a + " and " + b + " is: " + product(a, b));

        System.out.println("Factorial of " + b + "  is: " + factorial(b));
    }
}