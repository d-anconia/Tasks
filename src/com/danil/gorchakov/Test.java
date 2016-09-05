package com.danil.gorchakov;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// JUDGE_ID: 206830UH
// http://acm.timus.ru/problem.aspx?space=1&num=1001

public class Test{

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String... args) throws Exception {
        StringTokenizer tokenizer;
        Stack<Double> stack = new Stack<Double>();
        String line;
        while ( (line = reader.readLine()) != null ) {
            tokenizer = new StringTokenizer(line);
            while (tokenizer.hasMoreTokens()) {
                stack.add(Math.sqrt(Double.parseDouble(tokenizer.nextToken())));
            }
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

    }
}