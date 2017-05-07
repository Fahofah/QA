package com.company;

import java.util.Scanner;

    /**
     * Created by fahriulucay on 01/05/2017.
     */

    /* Class for asking the user information to enter that will be used within the program*/


    public class Ask {

        //Class variables
        int daynum;
        int [] ticketnos={0,0,0,0}; //In sequence of tickettypes
        int discount;
        int movienum;


        // Asks the day of choice for bookings
        public void Day() {
            String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
            int i;

            Scanner ans_day = new Scanner(System.in);

            System.out.println("\nWelcome, Please select the day for your movie:\n"); //display available days from array
            for (i = 0; i < days.length; i++) {
                System.out.println((i + 1) + "  " + days[i]);
            }
            daynum = ans_day.nextInt();             // get choice

            //check and save choice
            while (daynum<0||daynum>7){
                System.out.println("Invalid Entry. Please select from 1 to 7 accordingly from list");
                daynum= ans_day.nextInt();
            }

            if (daynum==3){
                discount=2; // £2 discount on Wednesdays
            } else {
                discount=0;
            }
        }

        //Lets user know about the discount day if not chosen
        public int DiscMsg(int disc){
            int resel=0;

            if (disc==0){
                System.out.println("\nWait ! We have £2 off on all tickets on Wednesdays! Do you want to reset your day to Wednesday to benefit from the discount? [Enter 1 for yes/0 for no]\n");
                Scanner ans_resel = new Scanner(System.in);
                resel = ans_resel.nextInt();
                while(resel!=0&&resel!=1){
                    System.out.println("Invalid Entry. Please select 1 or 0 accordingly");
                    resel= ans_resel.nextInt();
                }
            } else if (disc==2){
                System.out.println("\n___You will benefit from the Wednesday discount!___\n");
                resel=0;
            }

            return resel;
        }

        //Asks the movie selection
        public void Movie() {
            String[] movies = {"Avatar", "Pochahontas", "The Good The Bad The Ugly", "Forever Again"};
            int i;
            int reask = 1;

            System.out.println("Please select one of the current movies:\n");

            while (reask == 1) {

                for (i = 0; i < movies.length; i++) {

                    System.out.println((i + 1) + "  " + movies[i] + "\n"); //display available movies from array
                }

                Scanner ans_movie = new Scanner(System.in);         //get and save selection
                movienum = ans_movie.nextInt();

                if (0 < movienum && movienum < movies.length+1) {       //test and re ask selection if error
                    reask = 0;
                }
                else {
                    System.out.println("Invalid Entry. Please select from the range displayed.\n7");
                }
            }
        }

        //Asks the number and type of tickets required
        public void Type() {
            String tickettypes[] = {"Student", "OAP", "Child", "Standard"};
            int i;

            //display, ask and save corresponding amount for each type
            for (i = 0; i < tickettypes.length; i++) {
                System.out.println("How many " + tickettypes[i] + " tickets would you need?");
                Scanner ans_type = new Scanner(System.in);
                ticketnos[i] = ans_type.nextInt();
            }
        }
    }


