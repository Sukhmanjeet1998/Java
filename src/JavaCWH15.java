// Method Over-riding
class A{
    public int a;
    public int myNumber(){
        return 26;
    }
    public void method1(){
        System.out.println("Lovely day class A!");
    }
}
class B extends A{
    // method over riding
    @Override   // Override annotation
    public void method1(){
        System.out.println("Lovely day class B!");
    }
    public void method2(){
        System.out.println("Lovely day class B!");
    }
}


public class JavaCWH15 {
    public static void main(String[] args) {
//        A a = new A();
//        a.myMessage();
        B b = new B();
        b.method1();
        b.method2();
    }
}
