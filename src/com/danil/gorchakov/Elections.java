package com.danil.gorchakov;


//http://acm.timus.ru/problem.aspx?space=1&num=1263
import java.util.Scanner;

public class Elections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int mas[] = new int[n];
        int pidor;
        for(int i = 0; i < m; i++){
            pidor = scanner.nextInt();
            mas[pidor - 1]++;
        }

        for (int i = 0; i < n; i++)
            System.out.printf("%.2f%%%n",(double)mas[i]/m*100);
    }
}
