package com.company;


public class Main {

    /* Main Program Console */
    public static void main(String[] args) {

        int fin=0;

        Ask newAsk = new Ask();
        Cal newCal = new Cal();             //Object initiations
        Disp newDisp = new Disp();

        while (fin==0){                     //loop for the restarting the booking session

            int repick;

                          //loop for day choosing regarding wednesday discount
                newAsk.Day();
                repick = newAsk.DiscMsg(newAsk.discount);

                if(repick==1){              //if discount day change accepted set relevant variables and display message
                    newAsk.daynum=3;
                    newDisp.Disc();
                    newAsk.discount=2;
                }

            newAsk.Movie();         //movie Selection
            newAsk.Type();          //ticket type selections
            newCal.Total(newAsk.discount, newAsk.ticketnos);        //calculate total price

            newDisp.Summary(newCal.Price,newAsk.daynum,newAsk.movienum);       //display booking summary

            fin = newDisp.Confrm();                 //ask confirmation to finalise bookings, if unsatisfactory, restart or leave.

        }

    }
}
