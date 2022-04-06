package com.company;

public class Inter extends Thread{
    public void run()
    {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println("solved");
        }
    }

    public static void main(String[] args) {
        Inter t=new Inter();
        t.start();
        t.interrupt();
    }
}
