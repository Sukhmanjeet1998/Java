package EngineeringDigest;
class PrintNumber extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("PrintNumbers Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class PrintLetter implements Runnable{
    @Override
    public void run() {
        char[] alp = {'a','b','c','d','e'};
        for (char a : alp){
            System.out.println("PrintLetter: " + a);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class EdMt8 {
    public static void main(String[] args) {
        PrintNumber numberThread = new PrintNumber();
        numberThread.start();
        PrintLetter letterRunnable = new PrintLetter();
        Thread t1 = new Thread(letterRunnable);
        t1.start();
    }
}
