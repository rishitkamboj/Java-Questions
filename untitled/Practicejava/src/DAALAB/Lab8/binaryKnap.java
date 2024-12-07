package DAALAB.Lab8;

import java.util.Arrays;

public class binaryKnap {

    static int knapSack(int W, int wt[], int val[], int n) {
        if (n == 0 || W == 0)
            return 0;

        if (wt[n - 1] > W) {
            return knapSack(W, wt, val, n - 1);
        }

        return Math.max(knapSack(W, wt, val, n - 1),
                val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1));
    }

    static int knapSackMemo(int W, int wt[], int val[], int n, int dp[][]) {
        if (n == 0 || W == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n - 1] > W) {
            dp[n][W] = knapSackMemo(W, wt, val, n - 1, dp);
        } else {
            dp[n][W] = Math.max(knapSackMemo(W, wt, val, n - 1, dp),
                    val[n - 1] + knapSackMemo(W - wt[n - 1], wt, val, n - 1, dp));
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        int v[] = {10, 20, 30, 40};
        int w[] = {30, 10, 40, 20};
        int n = 4;
        int wt = 40;


        int ans = knapSack(wt, w, v, n);


        int dp[][] = new int[n + 1][wt + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);}
        int ans2 = knapSackMemo(wt, w, v, n, dp);

        System.out.println("Answer using recursion: " + ans + ", answer using DP: " + ans2);
    }}

