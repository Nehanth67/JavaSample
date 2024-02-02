package com.basicprograms;

import java.util.Scanner;

public class ProductminusAdd {
    public static void main(String[] args) {
        int p=1,s=0,sum=0,res,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");
        int x=sc.nextInt();
          while(x>0){
          y=x%10;  //getting remainder
              s=s+y;
              p=p*y;
          x=x/10;
          }
          res=p-s;
        System.out.println(res);
    }
}
