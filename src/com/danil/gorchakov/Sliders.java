package com.danil.gorchakov;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// http://acm.timus.ru/problem.aspx?space=1&num=1617
public class Sliders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new TreeMap<>();
        int n = scanner.nextInt();
        int d;

        for (int i = 0; i < n; i++) {
            d = scanner.nextInt();
            if (!map.containsKey(d))
                map.put(d, 1);
            else map.put(d, map.get(d) + 1);
        }
        int count = 0;
        int num;
        for (Integer i : map.values())
            if (i >= 4) {
                num = i / 4;
                count = count + num;
            }

        System.out.println(count);
    }
}
