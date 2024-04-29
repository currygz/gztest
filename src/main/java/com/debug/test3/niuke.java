package com.debug.test3;

import java.util.HashMap;
import java.util.Scanner;

public class niuke {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <num; i++) {
            int key = scanner.nextInt();
            int val = scanner.nextInt();
            map.put(key,map.getOrDefault(key,0)+val);
        }
        for (Integer key : map.keySet()) {
            System.out.println( key + " " + map.get(key));
        }
    }
}
