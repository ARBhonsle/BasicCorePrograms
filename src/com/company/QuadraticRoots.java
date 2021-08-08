package com.company;

import java.util.Scanner;

public class QuadraticRoots {
    static void printRoots(int a,int b,int c){
        double delta=Math.pow(b,2)-4*a*c;
        if(delta>=0){
            double root=(-b+Math.sqrt(delta))/(2*a);
            System.out.println("Root 1: "+root);
            root=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("Root 2: "+root);
        }else{
            System.out.println("Roots are imaginary");
        }
    }
    public static void main(String[] args){
        System.out.println("Finding Quadratic Roots");
        System.out.println("ax*x+bx+c=0");
        System.out.println("Coefficient: a, b, c: ");
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        printRoots(a,b,c);
    }
}
