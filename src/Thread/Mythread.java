package Thread;
class Mythread {
    private Counter counter;
    public Mythread(Counter counter){
        this.counter = counter;
    }
    public void callIncrement(){
        this.counter.increment();
    }
    public int getIncrement(){
        return this.counter.getCount();
    }
}
