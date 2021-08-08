package com.company;

import java.util.Scanner;

public class EvenOddNumbers {
    static void printResult(int number){
        if(number%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args){
        System.out.println("Even/Odd Numbers");
        System.out.println("Give Number");
        Scanner sc =new Scanner(System.in);
        int number= sc.nextInt();
        printResult(number);
    }
}
