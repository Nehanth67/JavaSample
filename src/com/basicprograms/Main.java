package com.basicprograms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Write a program to print whether a number is even or odd, also take input from the user.
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter number:");
            int x = sc.nextInt();
            if (x % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
            if(x==0){
                break;
            }
        }
    }
}