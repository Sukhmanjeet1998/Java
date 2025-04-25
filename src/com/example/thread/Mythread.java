package com.example.thread;
class Mythread extends Thread{
    private final Counter counter;
    public Mythread(Counter coer){
        this.counter = coer;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000 ; i++) {
            counter.increment();
        }
    }
}
