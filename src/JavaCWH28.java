// Multi Threading
class MyThread1 extends Thread{
    int i = 1;
    @Override
    public void run(){
        while(i<=400){
            System.out.println("Cooking Meal!");
            System.out.println("For Evening!");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    int i = 1;
    @Override
    public void run(){
        while(i<=400){
            System.out.println("Attend Office 2PM to 11PM!");
            System.out.println("Attend Meeting, APIs Integrating, UI design!");
            i++;
        }
    }
}
public class JavaCWH28 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
