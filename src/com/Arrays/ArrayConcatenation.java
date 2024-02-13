package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcatenation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size:");
        int size = in.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int n = nums.length;//3
        int m=2*n;
        int[] ans = new int[m];//6
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];//[i-->0,0,0     i+n--->,0,0,0]
            ans[i + n] = nums[i];
        }
        //System.out.println(Arrays.toString(ans));

//        for (int a:ans) {
//            System.out.print(a+" ");
//        }
        for (int i = 0; i < m; i++) {
            System.out.print(ans[i]+" ");
        }

    }
}
