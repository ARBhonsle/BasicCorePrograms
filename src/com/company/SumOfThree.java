package com.company;

import java.util.Scanner;

public class SumOfThree {
    static void printSum(int[] arr){
        int sum=0;
        for (int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    sum=arr[i]+arr[j]+arr[k];
                    if(sum==0){
                        System.out.println("Sum of triplets are 0: "+arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Sum of Three Integer");
        Scanner sc =new Scanner(System.in);
        System.out.println("Give number:N");
        int num= sc.nextInt();
        System.out.println("Give N integer values:");
        int[] number=new int[num];
        for(int i=0;i<num;i++){
            number[i]= sc.nextInt();
        }
        printSum(number);
    }
}
