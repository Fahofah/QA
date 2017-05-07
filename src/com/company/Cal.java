package com.company;

/**
 * Created by fahriulucay on 01/05/2017.
 */

//* Class for calculating the total price of selections
public class Cal {

    int Price;


    public void Total(int disc, int [] nos){
        int i,sum=0;
        int [] ticketprices={6,6,4,8}; //tickets prices respectively; student, oap, child, standard.

        for(i=0;i<nos.length;i++){
            sum=sum+(nos[i]*ticketprices[i])-(nos[i]*disc);
        }

        Price=sum;
    }
}
