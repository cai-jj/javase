package com.cjj.demo;

/**
 * 有符号右移操作符>>和无符号右移操作符>>>
 * 它们的区别在于，有符号右移操作符会将高位填充为符号位（即正数填充0，负数填充1），
 * 而无符号右移操作符会将高位填充为0。
 */
public class Demo6 {
    public static void main(String[] args) {
        int a = -8;
        int b = a >> 2;
        int c = -8;
        int d = c >>> 2;
        System.out.println(Integer.toBinaryString(a)); // 11111111111111111111111111111000
        System.out.println(Integer.toBinaryString(b)); // 11111111111111111111111111111110
        System.out.println(Integer.toBinaryString(c)); // 11111111111111111111111111111000
        System.out.println(Integer.toBinaryString(d));
    }
}
