package com.Arrays;

import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size:");
        int size = in.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(i==0)
                ans[i]=nums[i];
            else
            {
                ans[i]= nums[i]+ ans[i-1];//initial array current element plus new array previous element
            }
        }
        for (int a:ans) {
            System.out.println(a+" ");
        }


    }
}
