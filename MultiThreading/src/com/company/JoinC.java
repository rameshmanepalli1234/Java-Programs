package com.company;

public class JoinC extends Thread{
    public void run()
    {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
        catch(Exception e)
        {
            System.out.println("solved");
        }
    }

    public static void main(String[] args) throws InterruptedException{
        JoinC t=new JoinC();
        t.start();
        t.join();
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
        catch(Exception e)
        {
            System.out.println("solved");
        }
    }
}
