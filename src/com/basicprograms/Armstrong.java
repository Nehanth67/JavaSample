package com.basicprograms;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");//It is the number variable to be checked for armstrong
        int n = sc.nextInt();
        int r, sum = 0, temp;
        temp = n;
        while (n > 0) {
            r = n % 10;  // getting remainder
            sum = (int) (sum + Math.pow(r, 3));
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("armstrong number ");
        else {
            System.out.println("not armstrong");
        }
    }

}