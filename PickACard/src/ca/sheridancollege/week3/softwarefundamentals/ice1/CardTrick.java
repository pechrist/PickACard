/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Christopher Persaud 
 * Student Number : 991142167
 */
public class CardTrick {
    
    public static void main(String[] args)
    {   
        Scanner input = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        
        Random random = new Random();
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        System.out.println("Pick a suit for your card");//insert code to ask the user for Card value and suit, create their card
        for (int i =0; i< Card.SUITS.length; i++){
            System.out.println((i + 1)+ ":"+ Card.SUITS[i]);
        }
        int suit = input.nextInt();
        
        System.out.println("Enter Value (1 to 13");
        int value = input.nextInt();
          
        
        
              }
          
    
   
    
    
}
