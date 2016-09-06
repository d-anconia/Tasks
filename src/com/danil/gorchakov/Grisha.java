package com.danil.gorchakov;

// http://acm.timus.ru/problem.aspx?space=1&num=2012

import java.util.Scanner;

public class Grisha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int f = scanner.nextInt();
        int n = 12 - f;
        if(n*45 <= 4*60) System.out.println("YES");
        else System.out.println("NO");
    }
}
