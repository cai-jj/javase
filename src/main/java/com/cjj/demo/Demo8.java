package com.cjj.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i  = 0; i < 11; i++) {
            list.add(i);
        }

        for(int j = 0; j < list.size(); j += 2) {
            if(j + 2 > list.size()) {
                System.out.println(list.subList(j, list.size()));
                return;
            }
            System.out.println(list.subList(j, j + 2));
        }
    }
}
