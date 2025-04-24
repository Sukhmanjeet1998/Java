package Thread;

public class Test {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Mythread mt1 = new Mythread(c1);
    }
}
