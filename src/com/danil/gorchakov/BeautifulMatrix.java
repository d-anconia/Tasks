package com.danil.gorchakov;


import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int x = 0, y = 0;

        for(int i = 0 ; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if(scanner.nextInt() == 1){
                    x = i + 1;
                    y = j + 1;
                }
        System.out.println(Math.abs(x - 3) + Math.abs(y-3));
    }

}
