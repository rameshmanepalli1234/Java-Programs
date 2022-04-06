package com.company;

public class IsInter extends Thread{
    public void run()
    {
        System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
                System.out.println(Thread.interrupted());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        IsInter t=new IsInter();
        t.start();
        t.interrupt();
    }
}
