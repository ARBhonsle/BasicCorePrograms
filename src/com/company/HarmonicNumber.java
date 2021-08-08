package com.company;

import java.util.Scanner;

public class HarmonicNumber {
    static void harmonicNumber(int number){
        double val=0;
        for(double i=1;i<=number;i++){
            System.out.print("1/"+i);
            if ((i != number)) {
                System.out.print("+");
            }
            val+= 1/i;
        }
        System.out.println();
        System.out.println("Nth Harmonic Number:"+val);
    }
    public static void main(String[] args){
        System.out.println("Harmonic Number");
        System.out.println("Give number(N): [N>0]");
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        if(number>0)
        harmonicNumber(number);
        else
            System.out.println("Incorrect Input");
    }
}
