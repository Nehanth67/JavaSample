package com.functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data");
        int n=sc.nextInt();
        int res= fact(n);
        System.out.println(res);
    }

    private static int fact(int n) {
        int x = 1;
        if(n==0 || n==1)
        {
            return 1;
        }
        while (n > 0) {
            x *= n;
            n--;
        }
        return x;
    }
}
