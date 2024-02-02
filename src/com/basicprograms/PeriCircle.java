package com.basicprograms;

import java.util.Scanner;

public class PeriCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");
        float r=sc.nextFloat();
        float res= (float) (Math.PI*2*r);
        System.out.println(res);
    }
}
