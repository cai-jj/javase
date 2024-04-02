package com.cjj.dp;

/**
 *  背包问题
 *  0-1背包
 *  容量为W，每个物品价值为v，重量为w，求背包装满的最大价值，每个物品只能使用一次
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bagSize = 4;
        int maxValue = maxValue(weight, value, bagSize);
        System.out.println(maxValue);
    }


    public static int maxValue(int[] weight, int[] value, int bagSize) {

        //先遍历物品，再遍历背包,遍历顺序不能反
        int[] dp = new int[bagSize + 1];
        for(int i = 0; i < weight.length; i++) {
            for(int j = bagSize; j >= weight[i]; j--) {
                dp[j] = Math.max(dp[j - weight[i]] + value[i], dp[j]);
            }
        }
        return dp[bagSize];
    }
}
