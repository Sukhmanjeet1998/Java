package EngineeringDigest;

//public class EdMt2 extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0; i < 1000 ;i++) {
//            System.out.println("I: "+i);
//        }
//    }
//}
public class EdMt2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000 ;i++) {
            System.out.println("I: "+i);
        }
    }
}
