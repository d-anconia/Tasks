package com.danil.gorchakov;

import java.util.Scanner;

// http://acm.timus.ru/problem.aspx?space=1&num=1313
public class SportQuastion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n ; j++)
                a[i][j] = in.nextInt();

        for(int i = 0; i < n; i++){
            int x = i;
            int y = 0;
            while(x >=0 && x <= n){
                System.out.print(a[x][y]+" ");
                x--;
                y++;
            }
        }
        for(int i = 0; i < n; i++){
            int x = n - 1;
            int y = i+1;
            while(y >= 1 && y < n ){
                System.out.print(a[x][y] + " ");
                x--;
                y++;
            }
        }
    }
}
