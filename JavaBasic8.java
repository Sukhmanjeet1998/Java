import java.util.*;

public class JavaBasic8 {

    // method1
    public static void message() {
        System.out.println("Hello Function");
        return;
    }

    // method2
    public static int sum(int num1, int num2) { // formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a, int b) {
        // Call by value
        int temp = b;
        b = a;
        a = temp;
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static int factorial(int value) {
        int val = 1;
        while (value >= 1) {
            val = val * value;
            value--;
        }
        return val;
    }

    public static void isPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        sc.close();
        boolean isPrime = true;
        int div = 2;
        if (num <= 1) {
            System.out.println("Invalid number, Least Prime number is 2!");

        } else {
            while (div <= Math.sqrt(num)) {
                if (num % div == 0) {
                    isPrime = false;
                    break;
                }
                div++;
            }
            if (isPrime) {
                System.out.println(num + " is a Prime number!");
            } else {
                System.out.println(num + " is not a Prime number!");
            }
        }
        
    }

    // main method
    public static void main(String args[]) {
        int a = 3;
        int b = 4;
        int n = 5;
        int r = 2;
        int b_coff = (factorial(n) / (factorial(r) * factorial(n - r)));

        message();

        int sum = sum(5, 5); // arguments or actual parameters
        System.out.println(sum);

        swap(a, b);
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);

        System.out.println("Product of " + a + " and " + b + " is: " + product(a, b));

        System.out.println("Factorial of " + b + "  is: " + factorial(b));

        System.out.println("Binominal Coefficient is: " + b_coff);

        isPrime();
    }
}