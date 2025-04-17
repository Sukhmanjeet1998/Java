// Constructors from Thread class in Java
class MyThreads extends Thread{
    public MyThreads(String name){
        super(name);
    }
    public void run(){
        int i = 1;
        while(i<=200){
            System.out.println("Chai pee loo!");
            i++;
        }
    }
}
public class JavaCWH30 {
    public static void main(String[] args) {
        MyThreads mt = new MyThreads("Harry");
        mt.start();
        System.out.println("The id of the thread is: " + mt.getId());
        System.out.println("The id of the thread is: " + mt.getName());
        System.out.println("The id of the thread is: " + mt.getClass());
    }
}


