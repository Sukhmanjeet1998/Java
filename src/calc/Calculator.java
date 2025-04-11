package calc;

import java.util.Scanner;

class SimpleCalculator{
    protected final int a,b;
    private int c = 6;
    public int d = 7;
    int e = 77;
    SimpleCalculator(int a, int b){
            this.a = a;
            this.b = b;
        sumTwoNumber();
    }
    public void sumTwoNumber(){
        System.out.println("Simple Calculator");
        System.out.format("Sum of %d and %d is: %d\n",a,b,(a+b));
    }
}
// Polymorphism: Each class overrides sumTwoNumber, ensuring the correct implementation is called during its constructor.
class ScientificCalculator extends SimpleCalculator{
    ScientificCalculator(int a, int b){
        super(a,b);
        sumTwoNumber();
    }
    @Override
    public void sumTwoNumber(){
        System.out.println("Scientific Calculator");
        System.out.format("Sum of sin %d and sin %d is: %f\n",a,b,Math.sin(a+b));

    }
}
// Polymorphism: Each class overrides sumTwoNumber, ensuring the correct implementation is called during its constructor.
class HybridCalculator extends ScientificCalculator{
    HybridCalculator(int a, int b){
        super(a,b);
        sumTwoNumber();
    }
    @Override
    public void sumTwoNumber(){
        System.out.println("Hybrid Calculator");
        System.out.format("Sum of %d and %d is: %d\n",a,b,(a+b));
        System.out.format("Sum of sin %d and sin %d is: %f\n",a,b,Math.sin(a+b));
//        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
public class Calculator {
    protected int proInt = 6 ;
    int defInt = 6 ;
    public int pubInt = 777;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("This is a calculator class");
        System.out.println("Enter first number:");
        a = sc.nextInt();
        System.out.println("Enter second number:");
        b = sc.nextInt();
        HybridCalculator cal = new HybridCalculator(a,b);
        System.out.println("E: " + cal.e);
    }
}
