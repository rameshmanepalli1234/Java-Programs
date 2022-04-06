package com.company;

public class TotalEarnings2 extends Thread{
    int total=0;
    public void run()
    {
        synchronized (this)
        {
            for(int i=1;i<=10;i++)
            {
                total=total+100;
            }
            this.notify();
        }
    }
}
class MovieBookApp5
{
    public static void main(String[] args) throws InterruptedException {
        TotalEarnings2 te=new TotalEarnings2();
        te.start();
        synchronized (te)
        {
            te.wait();
            System.out.println("total earnings =" +te.total);

        }
    }
}
