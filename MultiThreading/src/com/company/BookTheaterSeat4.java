package com.company;

public class BookTheaterSeat4 {
    static int total_seats=20;
   static synchronized void bookSeat(int seats)
    {
        if(total_seats>=seats)
        {
            System.out.println("seats booked successfully");
            total_seats=total_seats-seats;
            System.out.println("seats left"+total_seats);
        }
        else
        {
            System.out.println("seats cannot be booked");
            System.out.println("seats left"+total_seats);
        }
    }
}
class MyThread1 extends Thread{
    BookTheaterSeat4 b;
    int seats;
    MyThread1(BookTheaterSeat4 b,int seats)
    {
        this.b=b;
        this.seats=seats;
    }
    public void run()
    {
        b.bookSeat(seats);
    }
}
class MyThread2 extends Thread
{
    BookTheaterSeat4 b;
    int seats;
    MyThread2(BookTheaterSeat4 b,int seats)
    {
          this.b=b;
          this.seats=seats;
    }
    public void run()
    {
        b.bookSeat(seats);
    }
}
class MovieBookApp2
{
    public static void main(String[] args) {
        BookTheaterSeat4 b1=new BookTheaterSeat4();
        MyThread1 t1=new MyThread1(b1,7);
        t1.start();
        MyThread2 t2=new MyThread2(b1,6);
        t2.start();
        BookTheaterSeat4 b2=new BookTheaterSeat4();
        MyThread1 t3=new MyThread1(b2,5);
        t3.start();
        MyThread2 t4=new MyThread2(b2,3);
        t4.start();
    }
}
