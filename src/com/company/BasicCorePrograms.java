package com.company;

import java.util.Scanner;

/**
 * Printing percent of heads and tails
 */

class FlipCoinPercent {
        static void coinPercent(int noFlips){
        int headsNumber=0,tailsNumber=0;
        for(int i=0;i<noFlips;i++){
            if((Math.random()) < 0.5){
                tailsNumber+=1;
            }else{
                headsNumber+=1;
            }
        }
        System.out.println("No of Heads: "+headsNumber+"; No of Tails: "+tailsNumber);
        double percentHead,percentTail;
        percentHead=(headsNumber*100/noFlips);
        percentTail=(tailsNumber*100/noFlips);
        System.out.println("Percent of Heads: "+percentHead+"; Percent of Tails: "+percentTail);
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Basic Core Programs");
        System.out.println("Coin Flip Problem");
        System.out.println("Give number of Coin is Flipped");
        Scanner read=new Scanner(System.in);
        int noFlips=read.nextInt();
        coinPercent(noFlips);
    }
}