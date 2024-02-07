package com.functions;

import java.util.Scanner;

public class Maxmin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data");
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();
        int max=maximum(i,j,k);
        int min=minimum(i,j,k);
        System.out.println("Result:\n"+min +"\n"+max);
    }

    private static int minimum(int i, int j, int k) {
        int min=i;
        if(i>j)
        {
            min=j;
        }
        if(k<min)
        {
            min=k;
        }
        return min;
    }

    private static int maximum(int i, int j, int k) {
        int max=i;
        if(i>j)
        {
            max=i;
        }
        if(k>max)
        {
            max=k;
        }
        return max;
    }
}
