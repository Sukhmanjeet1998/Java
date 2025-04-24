package EngineeringDigest;
class MyT1 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyT2 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class EdMt6 {
    public static void main(String[] args) {
        MyT1 t1 = new MyT1();
        MyT2 t2 = new MyT2();
        t1.start();
        t2.start();
    }
}
