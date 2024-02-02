package com.basicprograms;

import java.util.Scanner;

public class Ptr {

//    Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");
        float p = sc.nextFloat();
        int t = sc.nextInt();
        int r = sc.nextInt();
        float res=0;
        res=(p*t*r)/100;
        System.out.println("Simple Interest:"+res);
    }
}
