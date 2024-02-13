package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrangementasperIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int size = sc.nextInt();
        int[] nums = new int[size];
        int[] index= new int[size];
        System.out.println("enter array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("enter indxes:");
        for (int i = 0; i < nums.length; i++) {
            index[i] = sc.nextInt();
        }
        List<Integer> list=new ArrayList<>();
        int [] res=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if (index[i] >= list.size()) {
                list.add(nums[i]);
            } else {
                list.add(index[i], nums[i]);
            }
        }
//        {
//            list.add(index[i],nums[i]);
//        }
        for(int i=0;i<nums.length;i++)
        { res[i]=list.get(i);
        }

        System.out.println(Arrays.toString(res));
    }
}
