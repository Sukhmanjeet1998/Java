// Abstract class and Abstract Method
abstract class Parent2{
    Parent2(){
        System.out.println("Non param Base2 constructor!");
    }
    public void sayHello(){
        System.out.println("Hello Java developers!");
    }
    abstract public void message();
    abstract public void newMessage();
}
class Child2 extends Parent2{
    @Override
    public void message(){
        System.out.println("Good evening!");
    }
    @Override
    public void newMessage(){
        System.out.println("Godhood!");
    }
}
abstract class Child3 extends Parent2{
    public void newMessage(){
        System.out.println("Good evening!");
    }
}
public class JavaCWH19 {
    public static void main(String[] args) {
//        Parent2 p2 = new Parent2();
        Child2 c2 = new Child2();
//        Child3 c3 = new Child3();
    }
}
