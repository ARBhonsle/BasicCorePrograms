package com.company;

import java.util.Scanner;

public class SwapNumber {
    static void swapNumber(int number1,int number2){
        int temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("NumberA: "+number1+" NumberB: "+number2);
    }
    public static void main(String[] args){
        System.out.println("Swap Numbers");
        Scanner sc =new Scanner(System.in);
        System.out.println("Give number A");
        int numberA= sc.nextInt();
        System.out.println("Give number B");
        int numberB=sc.nextInt();
        swapNumber(numberA,numberB);
    }
}
