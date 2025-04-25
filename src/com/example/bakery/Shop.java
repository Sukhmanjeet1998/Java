package com.example.bakery;

public class Shop {
    public static void main(String[] args) {
        Notebook note = new Notebook();

        Workers w1 = new Workers(note,"Krishan");
        Workers w2 = new Workers(note,"Naresh");

        w1.start();
        w2.start();

        try{
            w1.join();
            w2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            Thread.currentThread().interrupt();
        }

        System.out.println("Total Pastries made today: " + note.getTotalPastries());
    }
}
