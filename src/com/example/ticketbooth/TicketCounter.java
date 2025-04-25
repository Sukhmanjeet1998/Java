package com.example.ticketbooth;
public class TicketCounter{
    private int totalTicketsInt = 0;

    public void increment(){
            totalTicketsInt++;
    }

    public int getTotalTicketsInt(){
        return totalTicketsInt;
    }
}
