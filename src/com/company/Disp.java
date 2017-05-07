package com.company;

import java.util.Scanner;

/**
 * Created by fahriulucay on 01/05/2017.
 */

/* Class for displaying various messages to the user*/
public class Disp {

    public void Disc(){
        System.out.println("__Discount Day Selected__\n");
    }


    public void Summary(int totalprice,int daynum,int movienum){
        String [] movies = {"Avatar","Pochahontas","The Good The Bad The Ugly","Forever Again"};
        String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println("____ The total price of your bookings for " +movies[movienum-1]+" on next "+days[daynum-1]+" is £" + totalprice+ " ____"); // print summary message from arrays
    }

    public int Confrm(){                //ask if final with decisions and if so display last massage, if not set to restart
        int restart;
        System.out.println("\nAre you happy to continue with the payment?\n\n1 Yes I would like to proceed\n0 No I would like to restart\n\nPlease enter your choice number...");
        Scanner ans_restart = new Scanner(System.in);
        restart = ans_restart.nextInt();

        if (restart==1){
            System.out.println("__***___Thank you and enjoy your movie!___***___");
        }

        return restart;
    }
}
