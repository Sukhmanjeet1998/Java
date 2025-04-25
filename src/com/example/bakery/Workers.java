package com.example.bakery;

public class Workers extends Thread{
    private final Notebook notebook;
    private String workerName;
    Workers (Notebook note, String workerName){
        this.notebook = note;
        this.workerName = workerName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            notebook.incrementPastries();
//            System.out.println(workerName + " baked pastry #" + (i + 1));
        }
    }
}
