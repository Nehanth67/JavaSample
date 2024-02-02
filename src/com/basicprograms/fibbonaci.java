package com.basicprograms;

import java.util.Scanner;

public class fibbonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");
        int n = sc.nextInt();
        int a = 0,b = 1,i=0,c=0;
        System.out.println(a);
        System.out.println(b);
        while(i<n)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            n--;
        }

    }
}
