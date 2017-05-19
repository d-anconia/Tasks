package com.danil.gorchakov;


import java.util.HashMap;
import java.util.Scanner;

public class Registration {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        String name;
        int temp = 0;

        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++){

            name = scanner.nextLine();

            if(map.containsKey(name)){
                temp = map.get(name)+1;
                map.put(name, temp);
                map.put(name+temp,0);
                System.out.println(name + "" + temp);

            } else {
                map.put(name,0);
                System.out.println("OK");
            }
        }


    }
}
