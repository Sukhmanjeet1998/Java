// this and super keyword
class Base1{
    private int a;

    //    constructor without params
    public Base1(){
        System.out.println("I am base class constructor");
    }
    //    constructor with params
    public Base1(int a){
        this.a = a;
        System.out.printf("Value of a is %d\n",a);
//        System.out.println("Instance of Base1: "+this);
    }
    public void messageB(){
        System.out.println("Message: I am in class Base");
    }
    public int getA(){
        return a;
    }

}
class Drive1 extends Base1{
    private int b;
    //    constructor without params
    public Drive1(){
        super();
        System.out.println("I am drive class constructor");
    }
    //    constructor with params
    public Drive1(int a, int b){
        super(a);
        this.b = b;
        System.out.printf("Value of b is %d\n",b);
//        System.out.println("Instance of Drive1: "+this);
    }
    public void messageD(){
        System.out.println("Message: I am in class Drive");
    }
    public int getB(){
        return b;
    }
}

class Child1 extends Drive1{
    private int c;
    //    constructor without params
    public Child1(){
        super();
        System.out.println("I am Child class constructor");
    }
    //    constructor with params
    public Child1(int a, int b,int c){
        super(a,b);
        this.c = c;
        System.out.printf("Value of c is %d\n",c);
        System.out.println("Instance of child1: "+this);  // prints the object reference
    }
    public void messageC(){
        System.out.println("Message: I am in class Child");
    }
    public void setC(int c){
        this.c = c;
    }
    public int getC(){
        return c;
    }
//    public void returnInstance(){
//        System.out.println(this);
//    }

}

public class JavaCWH14 {
    public static void main(String[] args) {
//        Drive1 d1 = new Drive1();

//        Drive1 d2 = new Drive1(4,6);

//        Child1 c1 = new Child1();

        Child1 c2 = new Child1(1,2,3);
        System.out.printf("A is %d\n",c2.getA());
        System.out.printf("B is %d\n",c2.getB());
        System.out.printf("C is %d\n",c2.getC());
//        c2.returnInstance();


    }
}

//this ensures the correct instance variable is updated in setters.
//super ensures the parent class constructor is called, maintaining the inheritance chain.
//Constructors are executed from the top of the hierarchy (Base1) down to the child class (Child1).

//this is used to refer to the current object’s instance variables or itself.
//super ensures the parent class’s constructor is called, maintaining the initialization chain in inheritance.
//The constructors execute from the top (Base1) down to the bottom (Child1).