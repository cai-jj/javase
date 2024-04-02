package com.cjj.demo;

import java.util.Scanner;

public class Demo1 {
//    public static void main(String[] args) {
//        double ans = 3.256;
//        System.out.println(String.format("%.2f", ans));
//    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int count = sc.nextInt();
            while(count > 0) {
                String s = sc.nextLine();
                String[] arr = s.split("\\s+");
                char[] ans = new char[arr.length];
                for(int i = 0; i < ans.length; i++) {
                    ans[i] = (char)(arr[i].charAt(0) - 32);
                }
                System.out.println(new String(ans));
                count--;
            }

        }
    }
}



