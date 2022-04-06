package com.company;
public class  StaticBlock
{
    int total_seats = 10;

     void bookSeat(int seats) {
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        synchronized (this) {
            if (total_seats >= seats) {
                System.out.println(seats + " booked successfully");
                total_seats = total_seats - seats;
                System.out.println("seats left" + total_seats);
            } else {
                System.out.println("seats cannot be booked");
                System.out.println("seats left" + total_seats);
            }
        }
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
    }
}
class MovieBookA extends Thread
{
    static StaticBlock b;
    int seats;
    public void run()
    {
        b.bookSeat(seats);
    }

    public static void main(String[] args) throws InterruptedException {
        b=new StaticBlock();
        MovieBookA t1=new MovieBookA();
        t1.seats=7;
        t1.start();
        MovieBookA t2=new MovieBookA();
        t2.seats=6;
        t2.start();
    }
}
