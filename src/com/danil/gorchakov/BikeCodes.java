package com.danil.gorchakov;

// http://acm.timus.ru/problem.aspx?space=1&num=1877
import java.util.Scanner;

public class BikeCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a % 2 == 0 || b % 2 == 1)
        System.out.println("yes");
        else System.out.println("no");
    }

}
