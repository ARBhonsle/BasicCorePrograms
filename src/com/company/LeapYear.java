package com.company;

import java.util.Scanner;

/**
 * Leap year -prints if input year is leap year or not
 */
public class LeapYear {
    static boolean checkYear(int year){
        if(year>999)
            return true;
        return false;
    }
    static boolean checkLeapYear(int year){
        if(((year%4==0 )&& (year%100 !=0)) || (year % 400 ==0))
            return true;
        return false;
    }
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("Leap Year Problem");
        System.out.println("Give input: year (4-digit)");
        int year =read.nextInt();
        if(checkYear(year)){
            if(checkLeapYear(year)){
                System.out.println("Year is Leap Year");
            }else{
                System.out.println("Year is not Leap Year");
            }
        }else{
            System.out.println("Incorrect Input year");
        }
    }
}
