package com.cjj.demo;

import java.util.LinkedHashMap;

public class Demo7 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("a", "2");
        map.put("g", "3");
        map.put("r", "1");
        map.put("e", "23");
        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }

}
