package com.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Primesbtwrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        int n = sc.nextInt();//start index
        int m = sc.nextInt();// end index
        List<Integer> list = findPrime(n, m);
        System.out.println(list);
    }
    static List<Integer> findPrime(int x, int y) {
        List<Integer> primes = new ArrayList<>();
        for (int num = x; num <= y; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}

