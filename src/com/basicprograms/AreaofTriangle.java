package com.basicprograms;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");
        float h = sc.nextFloat();
        float b = sc.nextFloat();
        float res = (h * b) / 2;
        System.out.println(res);
    }
}
