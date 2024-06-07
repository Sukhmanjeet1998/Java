import java.util.*;

public class JavaBasic {
    // 1. Introduction
    /*
     * public static void main(String args[]){
     * System.out.print("Hello World!\n Hello Sukhman ");
     * System.out.println("Hello World!");
     * System.out.println("Hello World!");
     * System.out.println("* * * *");
     * System.out.println("* * * ");
     * System.out.println("* * ");
     * System.out.println("* ");
     * int a = 10;
     * int b = 10;
     * int sum = a+b;
     * System.out.println(sum);
     * a = 56;
     * System.out.println(a+b);
     * byte by = 8;
     * short myShort = 240;
     * char myChar = 's';
     * boolean var = true;
     * float myFloat = 10.2f;
     * double myDouble = 3.14;
     * }
     */
    // 2. Input/Output
    /*
     * public static void main(String args[]) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter your first number!");
     * int num1 = sc.nextInt();
     * System.out.println("Enter your second number!");
     * int num2 = sc.nextInt();
     * int sum = num1 + num2;
     * int product = num1*num2;
     * System.out.println("Sum of "+num1+" and "+ num2+" is "+(sum));
     * System.out.println("Product of "+num1+" and "+num2+" is "+(product));
     * System.out.println("Enter radius of a circle!");
     * float radius = sc.nextFloat();
     * float area = (3.14f * radius * radius);
     * System.out.println("Area of circle is with radius: "+radius+" is "+area);
     * }
     */
    // 3. Type Promotion only with expression!
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        short c = 5;
        byte d = 25;
        byte bt = (byte) (a + b + c + d);

        System.out.println(b-a);
        System.out.println(bt );  // no sence

        int i = 10;
        float f = 20.25f;
        long l = 25;
        double d_ = 30;
        double ans = i + f + l + d_;
        System.out.println(ans);

        byte b_ = 5;
        // b_ = b_ * 2; // because of expression * java converted byte to int
        b_ = (byte) (b_ * 2); 
        System.out.println(b_);
    }
}

// print
// println
// "\n"
