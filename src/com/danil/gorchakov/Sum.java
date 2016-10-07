package com.danil.gorchakov;

// JUDGE_ID: 206830UH
// http://acm.timus.ru/problem.aspx?space=1&num=1068


import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++)
                sum = sum + i;
        } else {
            n = -n;
            for (int i = 1; i <= n; i++)
                sum = sum + i;
            sum = -sum + 1;
        }
        System.out.println(sum);
    }
}
