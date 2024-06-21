import java.util.Scanner;

public class JavaBasic6 {
    public static void main(String args[]) {
        // While Loop......................

        // Print number from 1 to 10
        /*
         * int counter = 1;
         * while (counter <= 10) {
         * System.out.println("Counter is " + counter);
         * counter++;
         * }
         */

        // Print number and Sum from 1 to n;
        /*
         * Scanner scan = new Scanner(System.in);
         * System.out.println("Enter your number!");
         * int myNumber = scan.nextInt();
         * int i = 1;
         * int sum = 0;
         * while (i <= myNumber) {
         * sum += i;
         * System.out.println("Counter is " + i);
         * i++;
         * }
         * System.out.println("Sum of numbers from 1 to " +myNumber + " is: "+sum);
         */

        // For Loop........................

        // Square Pattern
        /*
         * Scanner scan = new Scanner(System.in);
         * System.out.println("Enter side of square!");
         * int side = scan.nextInt();
         * for (int i = 1; i<=side; i++){
         * for (int j = 1; j <= side; j++){
         * System.out.print("* ");
         * }
         * System.out.println("");
         * }
         */

        // Reverse the number
        /*
         * int number = 10899;
         * int rem, myNum = 0;
         * 
         * while (number > 0) {
         * rem = number % 10;
         * myNum = myNum * 10 + rem;
         * number = number / 10;
         * }
         * System.out.println(myNum);
         */

        // Do While........................
        /*
         * int number = 1;
         * do {
         * System.out.println(number);
         * number ++;
         * } while (number <=10);
         */

        // Enter number till the number is not completely divided by 10
        /*
         * Scanner scan = new Scanner(System.in);
         * do{
         * System.out.println("Enter your number");
         * int number = scan.nextInt();
         * if (number % 10 == 0) {
         * System.out.
         * println("You have enter a number which is completely divided by 10, So the loop stop!"
         * );
         * break;
         * }
         * }while (true);
         */

        // Break and Continue
        /*
         * int number = 20;
         * for (int i = 1; i <= number; i++) {
         * if (i == 10) {
         * break;
         * } else if (i % 2 != 0) {
         * continue;
         * }
         * else{
         * System.out.println(i);
         * }
         * }
         */

        // Enter number till the number is not completely divided by 10 and just skip
        // that number and loop with exit if user enter -1
        /*
         * Scanner scan = new Scanner(System.in);
         * do {
         * System.out.println("Enter a number!");
         * int number = scan.nextInt();
         * if (number == -1) {
         * System.out.println("-1 to stop the loop!");
         * break;
         * }
         * else if (number % 10 == 0) {
         * continue;
         * }
         * else{
         * System.out.println(number);
         * }
         * } while (true);
         */

        // Check is a number is prime or not
        /*
        Scanner scan = new Scanner(System.in);
        int isPrime = 0;
        int num = scan.nextInt();
        if (num < 1) {
            System.out.println("Enter a valid number!");
        }else if(num == 1){
            System.out.println("Not a prime number");;
        }
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime++;
                    break;
                }
            }

            if (isPrime == 0) {
                System.out.println("Prime Number!");
            } else {
                System.out.println("Not a Prime Number");
            }
        }
        */
        
        // Question 1: How many times 'Hello' is printed?
        /*
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            i+=2;
        }
            // 2 times
        */
    
        // Question2: Write a program that reads a set of integers,and then prints the sum of the even and odd integers.
        
        // Way1
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many number you wanna enter!");
        int enterDigit = scan.nextInt();
        int sumEven, sumOdd;
        sumEven = sumOdd = 0;
        while (enterDigit!=0) {
            System.out.println("Enter a number!");
            int number = scan.nextInt();
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
            enterDigit--;
        }
        System.out.println("Sum of even number is: "+sumEven);
        System.out.println("Sum of odd number is: "+sumOdd);
        */
        
        // Way2
        /*
        Scanner sc=new Scanner(System.in);
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.print("Enter the number ");number=sc.nextInt();
            if(number%2==0) {
                evenSum+=number;
            }else{
                oddSum+=number;
            }
            System.out.print("Do you want to continue?Press1 for yes or 0 for no");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("Sum of even numbers: "+evenSum);
        System.out.println("Sum of odd numbers: "+oddSum);
        */

        // Qustion3: Write a program to find the factorialof any number entered by the user.
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to whom you wanna find the factorial!");
        int myNumber = scan.nextInt();
        int number = myNumber;
        int factorial = 1;
        while (myNumber!=0) {
            factorial *= myNumber;
            myNumber--;
        }
        System.out.println("Factorial of "+number+" is "+factorial);
        */
    
        // Question4: Write a program to print the multiplication table of a number N,entered by the user.
        /* 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number you want to find the multiplication table!");
        int myNumber = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(myNumber + "X" + i + " = "+ (myNumber*i));
        }
        */
    
        // Question5: Correct the code
        /*
        for (int i = 0; i <=5 ; i++) {
            System.out.println("i = "+i);
        }
        System.out.println("i after the loop = "+i);
        // i is a local variable here not a global variable, So we can't access out side the scope
        */
    }
}
