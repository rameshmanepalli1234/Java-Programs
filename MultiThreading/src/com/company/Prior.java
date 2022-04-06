package com.company;
//NORM_PRIORITY-5
//MIN_PRIORITY-1
//MAX_PRIORITY-10
public class Prior extends Thread {
    public void run()
    {
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Prior t=new Prior();
        t.start();
        t.setPriority(10);
    }
}
