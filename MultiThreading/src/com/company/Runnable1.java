package com.company;

public class Runnable1 implements Runnable {
    public void run()
    {
        System.out.println("thread-0");
    }
    public static void main(String[] args) {
        Runnable1 t=new Runnable1();
        Thread th=new Thread(t);
        th.start();
        System.out.println("main thread");
    }
}
