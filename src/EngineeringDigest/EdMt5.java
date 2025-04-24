package EngineeringDigest;

class MyTrd extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Daemon Thread");
        }
    }
}

public class EdMt5 {
    public static void main(String[] args) {
        MyTrd m1 = new MyTrd();
        m1.setDaemon(true);
        m1.start();
        System.out.println("Main thread stop!");
    }
}
