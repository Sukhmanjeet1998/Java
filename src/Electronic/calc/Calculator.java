package Electronic.calc;

class SimpleCalculator{
    protected final int a,b;
    private int c = 6;
    public int d = 7;
    int e = 77;
    protected int f = 80;
    SimpleCalculator(int a, int b){
            this.a = a;
            this.b = b;
        sumTwoNumberSi();
    }
    public void sumTwoNumberSi(){
        System.out.println("Simple Calculator");
        System.out.format("Sum of %d and %d is: %d\n",a,b,(a+b));
    }
}
// Polymorphism: Each class overrides sumTwoNumber, ensuring the correct implementation is called during its constructor.
class ScientificCalculator extends SimpleCalculator{
    ScientificCalculator(int a, int b){
        super(a,b);
        sumTwoNumberSc();
    }
    public void sumTwoNumberSc(){
        System.out.println("Scientific Calculator");
        System.out.format("Sum of sin %d and sin %d is: %f\n",a,b,Math.sin(a+b));

    }
}
// Polymorphism: Each class overrides sumTwoNumber, ensuring the correct implementation is called during its constructor.
class HybridCalculator extends ScientificCalculator{
    HybridCalculator(int a, int b){
        super(a,b);
        sumTwoNumberHy();
    }
    public void sumTwoNumberHy(){
        System.out.println("Hybrid Calculator");
        System.out.format("Sum of %d and %d is: %d\n",a,b,(a+b));
        System.out.format("Sum of sin %d and sin %d is: %f\n",a,b,Math.sin(a+b));
//        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}

public class Calculator {
    protected static int proInt = 6 ;
    static int defaultInt = 6 ;
    public static int pubInt = 777;

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("This is a calculator class");
        System.out.println("Enter first number:");
        a = sc.nextInt();
        System.out.println("Enter second number:");
        b = sc.nextInt();
        HybridCalculator cal = new HybridCalculator(a,b);
//        System.out.println("C: " + cal.c);
        System.out.println("D: " + cal.d);
        System.out.println("E: " + cal.e);
        System.out.println("F: " + cal.f);
        */
        System.out.println("I am a main method");
        System.out.println(proInt);
    }
}
