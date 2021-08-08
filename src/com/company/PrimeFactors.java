package com.company;

import java.util.Scanner;

public class PrimeFactors {
    static void primeFactor(int number){
        int i=2;
        while(i<=number){
            if(number%i==0){
                System.out.println(i);
                number/=i;
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Prime Factors");
        System.out.println("Give a number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        primeFactor(number);
    }
}
