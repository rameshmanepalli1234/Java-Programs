package com.company;

public class BookTheatreSeat2 {
    int total_seats = 10;

    synchronized void bookSeat(int seats) {
        if (total_seats >= seats) {
            System.out.println(seats + " booked successfully");
            total_seats = total_seats - seats;
            System.out.println("seats left" + total_seats);
        } else {
            System.out.println("seats cannot be booked");
            System.out.println("seats left" + total_seats);
        }
    }
}
class MovieBookAp extends Thread
{
    static BookTheatreSeat2 b;
    int seats;
    public void run()
    {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b=new BookTheatreSeat2();
        MovieBookAp t1=new MovieBookAp();
        t1.seats=7;
        t1.start();
        MovieBookAp t2=new MovieBookAp();
        t2.seats=6;
        t2.start();
    }
}
