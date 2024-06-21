
// Section 10: Conditional Statment
import java.util.Scanner;

public class JavaBasic5 {
    public static void main(String[] args) {
        // 1) if, else------------------------
        /*
        * int age = 18;
        * if (age >= 18) {
        * System.out.print("You can vote and drive!");
        * } else {
        * System.out.println("You must be 18 to vote and drive!");
        * }
        */
        
        // 1.1) Largest of two number!
        /*
        * int a = 1;
        * int b = 3;
        * if (a>b) {
        * System.out.println("A is greater than B!");
        * } else {
        * System.out.println("B is greater than A!");
        * }
        */
        
        // 1.2) Print if a number is Odd or Even
        /*
        * int num = 45;
        * if (num%2 == 0) {
        * System.out.println(num + " is Even!");
        * }
        * else{
        * System.out.println(num+ " is Odd!");
        * }
        */
        
        // 2) else if-------------------------
        /*
        * int marks = 13;
        * if (marks >= 50) {
        * System.out.println("Very Good Marks!");
        * }
        * else if (marks >= 30) {
        * System.out.println("Just Pass! But work more hard!");
        * }
        * else {
        * System.out.println("🙈 Aree Fail hai tu!");
        * }
        */
        
        // 2.1) Income Tax Calculator
        /*
        * Scanner scan = new Scanner(System.in);
        * System.out.println("Enter your Salary!");
        * int myIncome = scan.nextInt();
        * int myTax;
        * if (myIncome < 500000) {
        * myTax = 0;
        * }else if (myIncome >= 500000 && myIncome < 1000000) {
        * myTax = (int) (myIncome * 0.2);
        * }else{
        * myTax = (int) (myIncome * 0.3);
        * }
        * 
        * System.out.println("Your Tax is: "+ myTax + "!");
        */
        
        // 2.2) Print largest of 3
        /*
        * Scanner scan = new Scanner(System.in);
        * int a = scan.nextInt();
        * int b = scan.nextInt();
        * int c = scan.nextInt();
        * 
        * if (a >= b && a >= c) {
        * System.out.println("A is largest!");
        * } else if (b >= c){
        * System.out.println("B is largest!");
        * }else{
        * System.out.println("C is largest!");
        * }
        */
        
        // 3) ternary operator----------------
        /*
        * int age = 17;
        * System.out.println(age>=18?"You can Vote":"You can't vote, You are under 18"
        * );
        */
        
        // 4) switch--------------------------
        // Calculator
        /*
        * Scanner scan = new Scanner(System.in);
        * System.out.println("Enter number1");
        * int num1 = scan.nextInt();
        * System.out.println("Enter number2");
        * int num2 = scan.nextInt();
        * System.out.println("Enter Arthimetic operator (+,-,*,/) to do any operation!"
        * );
        * char op = scan.next().charAt(0);
        * switch (op) {
        * case '+':
        * System.out.println("Sum of "+num1+" and "+num2+" is: "+(num1+num2));
        * break;
        * case '-':
        * System.out.println("Difference of "+num1+" and "+num2+" is: "+(num1-num2));
        * break;
        * case '*':
        * System.out.println("Product of "+num1+" and "+num2+" is: "+(num1*num2));
        * break;
        * case '/':
        * System.out.println("Dividation of "+num1+" and "+num2+" is: "+(num1/num2));
        * break;
        * case '%':
        * System.out.println("Remainder of "+num1+" and "+num2+" is: "+(num1%num2));
        * break;
        * default:
        * System.out.println("Invalid operator!");
        * break;
        * }
        */
        
        // Question1:Write a Java program to get a number from the user and print whether it is positive or negative.
        /* 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number!");
        int number = scan.nextInt();
        if (number > 0) {
        System.out.println(number+" number is positive!");
        } else if (number < 0) {
        System.out.println(number+" number is negative!");
        } else {
        System.out.println("Given number is zero!");
        }
        */
        
        // Question2:Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your body temperature in Celsius!");
        int myTemperature = scan.nextInt();
        if (myTemperature > 100) {
        System.out.println("You have a fever!");
        }
        else{
        System.out.println("You don't have a fever!");
        }
        */
        
        // Question3:Write a Java program to input week number(1-7) and print day of week name using switch case.
        /* 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a week number(1-7)");
        int weekNumber = scan.nextInt();
        switch (weekNumber) {
        case 1:
        System.out.println("It's Monday");
        break;
        case 2:
        System.out.println("It's Tuesday");
        break;
        case 3:
        System.out.println("It's Wednesday");
        break;
        case 4:
        System.out.println("It's Thrusday");
        break;
        case 5:
        System.out.println("It's Friday");
        break;
        case 6:
        System.out.println("It's Saturday");
        break;
        case 7:
        System.out.println("It's Sunday");
        break;
        
        default:
        System.out.println("Invalid number, Please enter between 1 and 7!");
        break;
        }
        */
        
        // Question 4 :What will be the value of x & y in thefollowing program:
        /*
        int a=63, b=36;
        boolean x= (a<b)?true:false;  
        int y= (a>b)?a:b;
        System.out.println(x);   // false
        System.out.println(y);  // 63
        */
        
        // Question5: Write a Java program that takes a year from the user and print whether that year is a leap year or not.
        // Hint: 
        // 1. It is divisible by 4.
        // 2. If it is divisible by 100, it must also be divisible by 400.

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year!");
        int year = scan.nextInt();
        boolean x = (year%4)==0;
        boolean y = (year%100!=0);
        boolean z = ((year%100)==0 && (year%400)==0);


        if (x && (y || z)) {
            System.out.println(year+" is a leap year!");
        }else{
            System.out.println(year+" is not a leap year!");
        }
        */
    }
}
