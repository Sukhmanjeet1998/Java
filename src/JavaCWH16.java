// Dynamic method dispatch
class Phone{
    public void message(){
        System.out.println("This is a phone class!");
    }
    public void greet(){
        System.out.println("Welcome to Java World!");
    }
}
class SmartPhone extends Phone{
    @Override
    public void message(){
        System.out.println("This is a SmartPhone class!");
    }
    public void whichClass(){
        System.out.println("Welcome to Dynamic method dispatch class!");
    }
}

public class JavaCWH16 {
    public static void main(String[] args) {
//        Phone obj1 = new Phone();
//        obj1.message();
//        SmartPhone sm = new SmartPhone();
//        sm.message();

//        reference of subclass can be there for the super class but not vice versa
        Phone p1 = new SmartPhone();  // constructor will be of subclass
//        SmartPhone sm1 = new Phone();  error

        p1.message();
        p1.greet();
    }
}
