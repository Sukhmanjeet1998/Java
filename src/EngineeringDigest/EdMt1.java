package EngineeringDigest;
public class EdMt1 {
    public static void main(String[] args) {
//        System.out.println("Main method running...!");
//        System.out.println(Thread.currentThread().getName());
        EdMt2 e1 = new EdMt2();  // New
        Thread t1 = new Thread(e1);
        t1.start();  // Runnable
        for (int i = 0; i <= 1000 ;i++) {
            System.out.println("Hello");
        }


    }
}
