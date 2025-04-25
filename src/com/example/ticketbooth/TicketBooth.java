package com.example.ticketbooth;

public class TicketBooth {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

//        Two sellers
        TicketSeller seller1 = new TicketSeller(counter,"Krishan");
        TicketSeller seller2 = new TicketSeller(counter,"Naresh");

        seller1.start();
        seller2.start();

        try{
            seller1.join();
            seller2.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted while waiting for sellers: " + e.getMessage());
            // Optional: Restore interrupted status
            Thread.currentThread().interrupt();
        }

        System.out.println("Total ticket "+counter.getTotalTicketsInt());
    }
}
