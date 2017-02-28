package org.thenellb;


// template made for all cards
// All cards will now have same format


public class Curse extends Card {


    //constructor
    public Curse() {
        cardName ="Curse";
        text =       ""; // official description from dominion website
        victoryValue = -1;         // number of Victory points the card gives
        plusBuyValue = 0;         // number of +Buys the card gives
        plusTreasuryValue = 0;    // number of +Coins the card gives
        plusActionValue = 0;      // number of +Actions the card gives
        plusCardValue = 0;        // number of +Cards drawn
        cost = 0;                 // how many coins it costs to buy
        cardType = "VICTORY";

    }
    public int activate() {
        System.out.println("Playing the card:  " + cardName);
        return 17;
        //add things that will allow me to look through deck once deck is made
    }




}