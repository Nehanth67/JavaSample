package com.basicprograms;

import java.util.Scanner;

public class largest {
//    Take 2 numbers as input and print the largest number
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter data:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a>b)
    {
        System.out.println(a+" largest");
    }
    else
    {
        System.out.println(b+" largest");
    }
    sc.close();
}

}
