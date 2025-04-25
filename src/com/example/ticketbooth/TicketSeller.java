package com.example.ticketbooth;

public class TicketSeller extends Thread{
   private final TicketCounter counter;
   private final String sellerName;
   public TicketSeller(TicketCounter count, String sellerName){
        this.counter = count;
        this.sellerName = sellerName;
   }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
            System.out.println(sellerName + " sold ticket #" + (i+1));
         }

    }
}
