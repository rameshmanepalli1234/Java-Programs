package com.company;

public class BookTheatreSeat {
    int total_seats = 10;

    void bookSeat(int seats) {
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
class MovieBookApp extends Thread
{
    static BookTheatreSeat b;
    int seats;
    public void run()
    {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b=new BookTheatreSeat();
        MovieBookApp t1=new MovieBookApp();
        t1.seats=7;
        t1.start();
        MovieBookApp t2=new MovieBookApp();
        t2.seats=6;
        t2.start();
    }
}
