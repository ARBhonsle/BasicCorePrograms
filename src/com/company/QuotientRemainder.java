package com.company;

import java.util.Scanner;

public class QuotientRemainder {
    static void printResult(int dividend,int divisor){
        int quotient=dividend/divisor;
        int remainder=dividend%divisor;
        System.out.println("Qoutient: "+quotient+" Remainder:"+remainder);
    }
    public static void main(String[] args){
        System.out.println("Find Quotient and Remainder");
        Scanner sc =new Scanner(System.in);
        System.out.println("Give Dividend");
        int dividend= sc.nextInt();
        System.out.println("Give Divisor");
        int divisor=sc.nextInt();
        if(divisor!=0){
            printResult(dividend,divisor);
        }else{
            System.out.println("Divisor cannot be 0");
        }
    }
}
