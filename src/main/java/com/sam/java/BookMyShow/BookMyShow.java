package com.sam.java.BookMyShow;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class BookMyShow {
    private ArrayList<User> users;
    private ArrayList<Theater> theaters;
    private HashMap<String,ArrayList<Show>> movieMap;

    public BookMyShow(ArrayList<Theater> theaters) {
        this.users = new ArrayList<>();
        this.theaters = theaters;
        this.movieMap = new HashMap<>();

        generateMovieMap();
    }

    private void generateMovieMap(){
        for(Theater theater:this.theaters)
        {
            for(Show show : theater.getShows())
            {
                //old Movie just need to add the new show
                if(this.movieMap.containsKey(show.getMovie().getName()))
                {
                    this.movieMap.get(show.getMovie().getName()).add(show);
                }
                else{
                    //new Movie is not present
                    ArrayList<Show> showList = new ArrayList<>();
                    showList.add(show);
                    this.movieMap.put(show.getMovie().getName(),showList);
                }
            }
        }
    }

    public ArrayList<Show> searchShow(String movieName) throws Exception {
        if(this.movieMap.containsKey(movieName))
        {
            return this.movieMap.get(movieName);
        }
        else {
            throw new Exception("No Shows present for the given movie");
        }
    }

    public static void main(String[] args) throws ParseException {
        //Intialising all model object object
        //Create object of bookMyShow Application
        //Use it to book ticket and search shows

        //Users
        RegisteredUser samraat = new RegisteredUser("Samraat");
        RegisteredUser sonu = new RegisteredUser("Sonu");
        GuestUser swarnim = new GuestUser("Swarnim");

        //Movie
        Movie ironMan = new Movie("IRONMAN",Language.ENGLISH,Genre.ACTION);
        Movie ddlj = new Movie("DDLJ",Language.HINDI,Genre.ROMANCE);
        Movie avengers = new Movie("AVENGERS",Language.ENGLISH,Genre.ACTION);

        //Theater
        Theater PVR = new Theater("PVR","PATNA",40);
        Theater INOX = new Theater("INOX","BANGLORE",60);


        //For Time SimpleDateFormatter
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm:ss a");

        //Shows
        Show ironManShow1 = new Show(formatter.parse("Friday, Jan 10, 2023 10:00:00 AM"),ironMan,PVR);
        Show ddljManShow1 = new Show(formatter.parse("Monday, May 10, 2023 12:00:00 AM"),ddlj,INOX);
        Show ironManShow2 = new Show(formatter.parse("Tuesday, Dec 10, 2023 02:00:00 PM"),ironMan,INOX);
        Show avengerShow1 = new Show(formatter.parse("Sunday, Jan 10, 2023 04:00:00 PM"),avengers,PVR);
       // Show ironManShow = new Show(formatter.parse("Friday, Jan 10, 2023 10:00:00 AM"),ironMan,PVR);

        //BookMyShow
        ArrayList<Theater> theaters = new ArrayList<>();
        theaters.add(PVR);
        theaters.add(INOX);


        BookMyShow bookMyShow = new BookMyShow(theaters);
        //Search shows
        try{
           ArrayList<Show> shows=  bookMyShow.searchShow("DDLJ");
            System.out.println("Shows" + shows);
        } catch (Exception e){
            System.out.println(e);
        }

        //Book ticket
        try {
            Ticket samraatTicket = bookMyShow.bookTicket(ironManShow1,20,samraat,PVR.getName());
            System.out.println(samraatTicket.getTicketInfo());
        }catch (Exception e)
        {
            System.out.println(e);
        }

        try {
            Ticket swarnimTicket = bookMyShow.bookTicket(ironManShow2,20,swarnim,PVR.getName());
            System.out.println(swarnimTicket.getTicketInfo());
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    private Ticket bookTicket(Show show, int seats,User user, String theatre) throws Exception {
        if(user instanceof RegisteredUser)
        {
            return show.bookTicket(seats,(RegisteredUser) user,theatre);
        }
        else {
            throw new Exception("User is not registered user");
        }
    }


}
