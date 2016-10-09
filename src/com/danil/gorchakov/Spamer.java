package com.danil.gorchakov;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Spamer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String,Integer> map = new TreeMap<>();
        String s;
        for(int i = 0; i <= n; i++){
            s = scanner.nextLine();
            if (!map.containsKey(s))
                map.put(s, 1);
            else map.put(s, map.get(s) + 1);
        }
        for(String t : map.keySet()){
           if(map.get(t) > 1) System.out.println(t);
        }

    }
}
