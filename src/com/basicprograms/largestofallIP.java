package com.basicprograms;

import java.util.Scanner;

public class largestofallIP {
    public static void main(String[] args) {
        System.out.println("Enter data:");
        Scanner sc = new Scanner(System.in);
        int max=0;
        while(true)
        {int x = sc.nextInt();
            if(x>max) {
                max=x;
            }
            if(x==0) {
                break;
            }
        }
        System.out.println(max);

    }
}
