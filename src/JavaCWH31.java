// Thread Methods
class MyThr1 extends Thread{
    int i = 1;
    @Override
    public void run(){
        while (i<=100){
            System.out.println("@async with completable future!");
            i++;
        }
    }
}
class MyThr2 extends Thread{
    int i = 1;
    @Override
    public void run(){
        while (i<=100){
            System.out.println("Multithreading, Executor framework!");
//            try {
//                Thread.sleep(455);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
            i++;
        }
    }
}
public class JavaCWH31 {
    public static void main(String[] args) {
        MyThr1 mt1 = new MyThr1();
        MyThr2 mt2 = new MyThr2();
        mt1.start();
        try {
            mt1.join();  // start mt2 when mt1 is dead completely
        }catch (Exception e){
            System.out.println(e);
        }
        mt2.start();
    }
}
