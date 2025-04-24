package EngineeringDigest;

public class EdMt4 extends Thread {
    EdMt4(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5 ; i++) {
            System.out.println(Thread.currentThread().getName() + ", Priority: " + Thread.currentThread().getPriority() + ", count: " + i);
//            Thread.yield();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        EdMt4 e1 = new EdMt4("Min");
        e1.setPriority(Thread.MIN_PRIORITY);
//        e1.interrupt();
        EdMt4 e2 = new EdMt4("Max");
        e2.setPriority(Thread.MAX_PRIORITY);
        EdMt4 e3 = new EdMt4("Nor");
        e3.setPriority(Thread.NORM_PRIORITY);
        e1.start();
        e2.start();
        e3.start();
    }
}

// Start, Run, Join, Sleep, set and get priority, Naming thread, interrupt, yield, setDaemon