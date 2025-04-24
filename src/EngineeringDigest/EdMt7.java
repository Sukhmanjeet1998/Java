package EngineeringDigest;
class MyTh1 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Thread1: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class EdMt7 {
    public static void main(String[] args) {
        MyTh1 t1 = new MyTh1();
        Thread t2 = new Thread(t1);
        System.out.println(t2.getState());
        t2.start();
        System.out.println(t2.getState());
    }
}
// Methods like Thread.sleep() throw InterruptedException. Use a try-catch block, as shown in the examples.