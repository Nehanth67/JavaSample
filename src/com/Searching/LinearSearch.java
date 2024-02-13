package com.Searching;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3456;
        System.out.println(linearSearch(arr, target, 1, 4));
        String name = "Kunal";
        char target1 = 'u';
//        System.out.println(search(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = start; index <= end; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }

    static boolean search2(String str, char target1) {
        if (str.length() == 0) {
            return false;
        }

        for(char ch : str.toCharArray()) {
            if (ch == target1) {
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target1) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target1 == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
