package com.basicprograms;

import java.util.Scanner;

public class calculate {
//    Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter data:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    String oper =sc.next();
    if(oper.equals("+"))
{
    System.out.println(a+b);
}

sc.close();
}

}
