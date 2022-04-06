package com.company;

public class Get extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Get t=new Get();
        t.start();
        System.out.println(t.getName());
        Get t2=new Get();
        t2.start();
        System.out.println(t2.getName());
    }
}
