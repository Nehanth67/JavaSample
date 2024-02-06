package com.basicprograms;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("enter Data" );
        Scanner sc=new Scanner(System.in);
        boolean x=isPrime(sc.nextInt());
        System.out.println(x);
    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
