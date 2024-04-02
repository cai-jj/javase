package com.cjj.demo;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * HashMap& Hashtable
 *
 */
public class Demo4 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(null, null);
        map.put(1, null);
        map.forEach((k, v) -> System.out.println(k + ":" + v));

        Hashtable ht = new Hashtable();
        //key value都不能为null
//        ht.put(null, 1);
//        ht.put(1, null);
        ht.put(1, 1);
        ht.forEach((k, v) -> System.out.println(k + ":" + v));

    }
}
