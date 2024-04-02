package com.sam.java.BookMyShow;

import java.sql.SQLOutput;
import java.util.Date;

public class Ticket {

    private static int idCounter;
    private int id;
    private String ownerName;
    private Date bookingTime;
    private int noOfSeats;
    private Show bookedShow;
    private String theatre;

    public Ticket( String ownerName, Date bookingTime, int noOfSeats,String theatre) {
        idCounter++;
        this.id = idCounter;
        this.ownerName = ownerName;
        this.bookingTime = bookingTime;
        this.noOfSeats = noOfSeats;
        this.theatre = theatre;
    }

    public String getTicketInfo(){
        return "Ticket booked for " + this.getOwnerName()
                + "at time" + this.getBookingTime()
                + "for number of seats " + this.getNoOfSeats()
                + ", for movie "+ this.getBookedShow().getMovie()
                +"at theatre "+ this.getTheatre();
    }

    public int cancelTicket()
    {
        this.theatre =null;
        this.ownerName = null;
        this.noOfSeats = 0;

        System.out.println("Ticket GOT CANCELLED Successfully");
        return 1;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public Show getBookedShow() {
        return bookedShow;
    }

    public void setBookedShow(Show bookedShow) {
        this.bookedShow = bookedShow;
    }

    public String getTheatre() {
        return theatre;
    }

    public void setTheatre(String theatre) {
        this.theatre = theatre;
    }
}
