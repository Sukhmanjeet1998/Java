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

    // main method
    public static void main(String args[]) {
        message();
        int sum = sum(5, 5);  // arguments or actual parameters
        System.out.println(sum);
    }
}