package com.company;

import java.util.Scanner;

public class PowerOfTwo {
    static void powerTwo(int number){
        int result=1;
        for(int i=0;i<=number;i++){
            System.out.println("2^"+(i)+" ="+result);
            result=result*2;
        }
    }
    public static void main(String[] args){
        System.out.println("Give a positive number(N) [N>=0 && N<31]");
        Scanner read =new Scanner(System.in);
        int number=read.nextInt();
        if(number>=0 && number<31)
        powerTwo(number);
        else
            System.out.println("Incorrect Input");
    }
}
