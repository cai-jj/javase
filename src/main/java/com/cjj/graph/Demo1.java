package com.cjj.graph;

import java.util.Arrays;

/**
 * floyd算法求最短路径
 */
public class Demo1 {
    public static void main(String[] args) {
        int[][] graph = new int[7][7];
        for(int i = 0; i < graph.length; i++) {
            Arrays.fill(graph[i], Integer.MAX_VALUE);
        }

        for(int i = 0; i < graph.length; i++) {
            graph[i][i] = 0;
        }
        graph[0][1] = 9;
        graph[0][5] = 1;
        graph[1][0] = 9;
        graph[1][2] = 4;
        graph[1][6] = 3;
        graph[2][1] = 4;
        graph[2][3] = 2;
        graph[3][2] = 2;
        graph[3][4] = 6;
        graph[3][6] = 5;
        graph[4][3] = 6;
        graph[4][5] = 8;
        graph[4][6] = 7;
        graph[5][0] = 1;
        graph[5][4] = 8;
        graph[6][1] = 3;
        graph[6][3] = 5;
        graph[6][4] = 7;
        floyd(graph);
        for (int i = 0; i < graph.length; i++) {
            System.out.println(Arrays.toString(graph[i]));
        }
    }

    static void floyd(int[][] graph) {
        int n = graph.length;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (graph[i][k] != Integer.MAX_VALUE && graph[k][j] != Integer.MAX_VALUE) {
                        graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                    }
                }
            }
        }
    }
}
