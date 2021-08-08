package com.company;

import java.util.Scanner;

public class WindChill {
    static void windTemperature(double temperature, double velocity){
        double effectiveTemp=35.74+0.6215*temperature+(0.4275*temperature+35.75)*Math.pow(velocity,0.16);
        System.out.println("Effective wind temperature: "+effectiveTemp);
    }
    public static void main(String[] args){
        System.out.println("Wind Chill Calculation");
        System.out.println("Formula: 35.74+0.6215t+(0.4275t-35.75)v^(0.16) where t=temperature,v=wind velocity");
        System.out.println("Give temperature: [>50 F]");
        Scanner sc=new Scanner(System.in);
        double temperature= sc.nextInt();
        System.out.println("Give wind velocity: [120 miles/hr to 3 miles/hr]");
        double velocity= sc.nextInt();
        if(temperature>50 && velocity>3 && velocity<120){
            windTemperature(temperature,velocity);
        }else{
            System.out.println("wrong input");
        }
    }
}
