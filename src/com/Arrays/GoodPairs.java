package com.Arrays;

import java.util.Scanner;

public class GoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int ctr=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j] && i < j){
                    ctr++;
                }
            }
        }
        System.out.println("Good Pairs count:"+ctr);
    }

}
