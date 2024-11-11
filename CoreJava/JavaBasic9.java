
// Class and Object, Method Loading
import java.util.*;
import java.lang.*;

class Calculator {

    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public int add(int num1, int num2, int num3){
        int result = num1 + num2 + num3;
        return result;
    }

    public int add(double num1, double num2, double num3){
        int result = (int) (num1 + num2 + num3);
        return result;
    }

    public String message(){
        return "Hi How's Java!";
    }
}

public class JavaBasic9 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int n1 = 3;
        int n2 = 3;
        int n3 = 3;
        int result = calc.add(n2, n1);
        int result2 = calc.add(n2, n1, n3);
        int result3 = calc.add(3.0, 3.0, 4.0);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(calc.message());
    }

}