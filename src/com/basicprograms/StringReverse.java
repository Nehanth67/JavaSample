package com.basicprograms;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println("enter data");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String rev="";
        int l=str.length();
        for (int i=l-1;i>=0;i--)
        {
         rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
}
