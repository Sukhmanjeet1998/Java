package Thread;

public class Test {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Mythread mt1 = new Mythread(c1);
        mt1.callIncrement();
        System.out.println(mt1.getIncrement());
//        mt1.counter.increment();
//        System.out.println();
    }
}
