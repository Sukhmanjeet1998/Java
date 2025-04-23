// Constructors from Thread class in Java
class MyThreads extends Thread{
    public MyThreads(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 1;
        while(i<=200){
            System.out.println("Chai pee loo!" + this.getName());
            i++;
        }
    }
}
class MyThreads2 extends Thread{
    @Override
    public void run(){
        int i = 1;
        while(i<=200){
            System.out.println("Ofs meeting!!");
            i++;
        }
    }
}
public class JavaCWH30 {
    public static void main(String[] args) {
        MyThreads mt = new MyThreads("Harry 4");
        MyThreads mt1 = new MyThreads("Krishan 2");
        MyThreads mt2 = new MyThreads("Simran 3");
        MyThreads mt3 = new MyThreads("Mithun 1");
        mt3.setPriority(Thread.MAX_PRIORITY);
        mt.setPriority(Thread.MIN_PRIORITY);
//        MyThreads2 mt2 = new MyThreads2();
        mt.start();
        mt1.start();
        mt2.start();
        mt3.start();
//        System.out.println("The id of the thread is: " + mt.getId());
//        System.out.println("The id of the thread1 is: " + mt1.getId());
//        System.out.println("The id of the thread2 is: " + mt2.getId());
//        System.out.println("The name of the thread is: " + mt.getName());
//        System.out.println("The class of the thread is: " + mt.getClass());

//        System.out.println("The name of the thread is: " + mt.getName());
//        System.out.println("The name of the thread is: " + mt1.getName());
//        System.out.println("The name of the thread is: " + mt2.getName());
//        System.out.println("The name of the thread is: " + mt3.getName());
    }
}


