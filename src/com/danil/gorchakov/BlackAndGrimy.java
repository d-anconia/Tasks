package com.danil.gorchakov;

// http://acm.timus.ru/problem.aspx?space=1&num=1924

import java.util.Scanner;

public class BlackAndGrimy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i = 0; i <= n; i++)
            if(i%2 == 1)count++;

        if(count % 2 == 0) System.out.println("black");
        else System.out.println("grimy");
    }
}
