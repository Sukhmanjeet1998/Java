class MyTh3 extends  Thread{
    int i = 1;
    @Override
    public void run(){
        while (i<=100){
            System.out.println("Good Morning!");
            i++;
        }
    }
}
class MyTh4 extends  Thread{
    int i = 1;
    @Override
    public void run(){
        while (i<=100){
            System.out.println("Welcome!");
            i++;
        }
    }
}
public class JavaCWH33 {
    public static void main(String[] args) {
        MyTh3 t3 = new MyTh3();
        MyTh4 t4 = new MyTh4();
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t3.start();
        t4.start();
        System.out.println("T3 State " + t3.getState());
        System.out.println("T4 State " + t4.getState());
        System.out.println("T3 Reference " + t3.getId());
        System.out.println("T4 Reference " + t4.getId());
    }
}
