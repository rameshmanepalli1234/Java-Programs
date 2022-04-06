package com.company;
class Test1 extends Thread{
    public void run()
    {
        System.out.println("hi");
    }
}
class Test2 extends Thread{
    public void run()
    {
        System.out.println("welcome");
    }
}

public class  MultiThread extends Thread{
    public void run()
    {
        System.out.println("to java");
    }
    public static void main(String[] args)
    {
        System.out.println("main-thread");
        MultiThread t=new MultiThread();
        t.start();
        Test1 t1=new Test1();
        t1.start();
        Test2 t2=new Test2();
        t2.start();
    }
}
