package com.basicprograms;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");
        float r=sc.nextFloat();
        float res= (float) (Math.PI*(Math.pow(r, 2)));
        System.out.println(res);
    }
}
