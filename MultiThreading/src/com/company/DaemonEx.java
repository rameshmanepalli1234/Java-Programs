package com.company;

public class DaemonEx extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        DaemonEx t=new DaemonEx();
        t.setDaemon(true);
        t.start();
    }

}
