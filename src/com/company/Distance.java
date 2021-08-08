package com.company;

import java.util.Scanner;

public class Distance {
    static void calcDistance(int x,int y){
        double distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("Distance: "+distance);
    }
    public static void main(String[] args){
        System.out.println("Distance between coordinate point(x,y) from origin(0,0)");
        Scanner sc=new Scanner(System.in);
        System.out.println("x-coordinate");
        int x=sc.nextInt();
        System.out.println("y-coordinate");
        int y=sc.nextInt();
        calcDistance(x,y);
    }
}
