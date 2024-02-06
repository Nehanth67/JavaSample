package com.basicprograms;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            sum=sum+x;
        }
        System.out.println(sum/n);
    }
}
