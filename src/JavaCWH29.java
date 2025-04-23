// Thread Using Runnable Interface
class MyThread implements Runnable{
    @Override
    public void run(){
        int i = 1;
        while (i<=200){
            System.out.println("Cooking Shahi Paneer on Thursday!");
            i++;
        }
    }

    public void start() {

    }
}
class MyThread_2 implements Runnable{
    @Override
    public void run(){
        int i = 1;
        while (i<=200){
            System.out.println("Working on APIs integration on Thursday!");
            i++;
        }
    }
}
public class JavaCWH29 {
    public static void main(String[] args) {
        MyThread bullet1 = new MyThread();
        Thread t1 = new Thread(bullet1);
        MyThread_2 bullet2 = new MyThread_2();
        Thread t2 = new Thread(bullet2);
        t1.start();
        t2.start();

    }
}
