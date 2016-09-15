package com.danil.gorchakov;


import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.nextLine();
        int k = s.length() - 1;
        int p = 1;
        if (n % k != 0) {
            int t = n;
            while (n != t % k) {
                p = p * n;
                n = n - k;
            }
            p = p * (t % k);
        } else {
            while (n != k) {
                p = p * n;
                n = n - k;
            }
            p = p * k;
        }
        System.out.println(p);
    }
}
