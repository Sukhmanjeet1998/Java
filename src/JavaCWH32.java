class MyTh1 extends  Thread{
    int i = 1;
    @Override
    public void run(){
        while (i<=100){
            System.out.println("Good Morning!");
            i++;
        }
    }
}
class MyTh2 extends  Thread{
    int i = 1;
    @Override
    public void run(){
        while (i<=100){
            try {
                Thread.sleep(200);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Welcome!");
            i++;
        }
    }
}
public class JavaCWH32 {
    public static void main(String[] args) {
        MyTh1 t1 = new MyTh1();
        MyTh2 t2 = new MyTh2();
        t1.start();
        t2.start();
    }
}
