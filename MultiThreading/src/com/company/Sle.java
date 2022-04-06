package com.company;

public class Sle extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("solved");

        }
    }


        public static void main(String[] args)
        {
            Sle t = new Sle();
            t.start();
        }
    }
