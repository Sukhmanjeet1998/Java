
// Class and Object
import java.util.*;
import java.lang.*;

class Calculator {
    public int add(int num1, int num2) {
        int result = num1 + num2;
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
        int result = calc.add(n2, n1);
        System.out.println(result);
        System.out.println(calc.message());
    }

}