package EngineeringDigest;

public class EdMt3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 1000 ; i++) {
            try {
                Thread.sleep(10);
                System.out.println("Hello");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        EdMt3 e1 = new EdMt3();
        System.out.println("State: " + e1.getState());
        e1.start();
        System.out.println("State: " + e1.getState());
        System.out.println(e1.getState());
        Thread.sleep(100);
        System.out.println(e1.getState());
        e1.join();
        System.out.println(e1.getState());
    }
}

// Start, Run, Join, Sleep,