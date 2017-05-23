package com.danil.gorchakov;


import java.util.Scanner;

public class YoungPhisic {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0 ,y = 0 , z = 0;
        for(int i = 0; i < n; i++){
            x = x + scanner.nextInt();
            y = y + scanner.nextInt();
            z = z + scanner.nextInt();
        }
        if (x == 0 && y == 0 && z == 0 ) System.out.println("YES");
        else System.out.println("NO");
    }
}
