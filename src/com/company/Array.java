package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class Array {
    static void printArray(int[][] arr,int row,int column){
        PrintWriter print =new PrintWriter(System.out);
        System.out.println("Integer Array:");
        for(int i=0;i< row;i++) {
            for (int j = 0; j < column; j++) {
                print.println(arr[i][j]);
            }
        }
        print.flush();
        print.close();
    }
    static void printArray(double[][] arr,int row,int column){
        System.out.println("Double Array:");
        for(int i=0;i< row;i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void printArray(boolean[][] arr,int row,int column){
        System.out.println("Boolean Array:");
        for(int i=0;i< row;i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.println("Print 2D Array");
        Scanner sc =new Scanner(System.in);
        System.out.println("Rows (m):");
        int m= sc.nextInt();
        System.out.println("Columns (n): ");
        int n=sc.nextInt();
        System.out.println("Give values for m*n integer array");
        int[][] arrInt=new int[m][n];
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                arrInt[i][j] = sc.nextInt();
            }
        }
        System.out.println("Give values for m*n double array");
        double[][] arrDouble=new double[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arrDouble[i][j]= sc.nextDouble();
            }
        }
        System.out.println("Give values for m*n boolean array");
        boolean[][] arrBoolean=new boolean[m][n];
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                arrBoolean[i][j] = sc.nextBoolean();
            }
        }
        System.out.println("Output of arrays:");
        printArray(arrDouble,m,n);
        printArray(arrBoolean,m,n);
        printArray(arrInt,m,n);
    }
}
