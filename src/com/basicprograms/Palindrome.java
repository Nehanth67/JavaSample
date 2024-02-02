package com.basicprograms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");
        String str = sc.next();//
        int x=str.length();
        String res = "";
        for (int i = x - 1; i >= 0; i--){
            res +=str.charAt(i);
        }
        if(str.equals(res))
        {
            System.out.println("pali");
        }
        else {
            System.out.println("not");
        }
    }
}

//For number:
//    int r,sum=0,temp;
//    int n=454;//It is the number variable to be checked for palindrome
//
//  temp=n;
//          while(n>0){
//          r=n%10;  //getting remainder
//          sum=(sum*10)+r;
//          n=n/10;
//          }
//          if(temp==sum)
//          System.out.println("palindrome number ");
//          else
//          System.out.println("not palindrome");
//          }