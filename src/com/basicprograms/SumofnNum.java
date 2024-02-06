package com.basicprograms;

import java.util.Scanner;

public class SumofnNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum=(n*(n-1))/2;
        }
        System.out.println(sum);
    }
}
