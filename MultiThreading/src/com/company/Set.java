package com.company;

public class Set extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("ramesh");
        System.out.println(Thread.currentThread().getName());
        Set t=new Set();
        t.start();
        t.setName("ram");
        System.out.println(t.getName());
    }
}
