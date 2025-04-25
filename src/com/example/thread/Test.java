/*
Imagine you’re at a lemonade stand, and you’re counting how many cups of lemonade you sell. You have a notebook where you write the number of cups sold, starting at 0. Every time you sell a cup, you add 1 to the number in the notebook. Now, what if you have multiple helpers selling lemonade at the same time? You need to make sure they don’t mess up the count by writing in the notebook at the exact same moment. This code is like that—it’s about counting things (like lemonade cups) and making sure the count is correct, even when multiple people (or “threads”) are helping.

The code has three parts:
Counter: The notebook that keeps track of the count.
Mythread: A helper who can add to the count in the notebook.
Test: The boss who sets everything up and checks the final count.
*/
package com.example.thread;

public class Test {
    public static void main(String[] args){
        Counter c1 = new Counter();
        Mythread mt1 = new Mythread(c1);
        Mythread mt2 = new Mythread(c1);
        mt1.start();
        mt2.start();
       try{
           mt1.join();
           mt2.join();
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
        System.out.println(c1.getCount());
    }
}
