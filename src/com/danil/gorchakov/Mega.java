package com.danil.gorchakov;

// http://acm.timus.ru/problem.aspx?space=1&num=1787

import java.util.Scanner;

public class Mega {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int num = 0;
        int car = 0;
        for(int i = 0; i < n; i++){
            car = scanner.nextInt();
            num = num + car - k;
            if(num < 0 ) num = 0;
        }
        System.out.println(num);
    }
}
