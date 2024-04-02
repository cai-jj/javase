package com.cjj.demo;

public class Demo2 {
    static int n = 1005;
    static int[] father = new int[n];

    public static void main(String[] args) {
        init();
        join(1, 2);
        join(3, 2);
        join(5, 6);
        System.out.println(isSame(1, 3));
        System.out.println(isSame(5, 1));
    }


    static void init() {
        for (int i = 0; i < n; i++) {
            father[i] = i;
        }
    }

    static int find(int u) {
        if (u == father[u]) {
            return u;
        } else {
            return father[u] = find(father[u]);
        }
    }

    static boolean isSame(int u, int v) {
        u = find(u);
        v = find(v);
        if(u == v) return true;
        else return false;
    }

    static void join(int u, int v) {
        u = find(u);
        v = find(v);
        if(u == v) return;
        father[v] = u;
    }
}
