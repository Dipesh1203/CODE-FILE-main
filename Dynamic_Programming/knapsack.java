import java.util.*;

public class knapsack {
    public static int knapsack(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {// valid
            // include
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);
            // exclude
            int ans2 = knapsack(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
        } else {
            return knapsack(val, wt, W, n - 1);
        }
    }

    // memoization
    public static int knapsackmemoization(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (dp[n][W] != -1)
            return dp[n][W];
        if (wt[n - 1] <= W) {// valid
            // include
            int ans1 = val[n - 1] + knapsackmemoization(val, wt, W - wt[n - 1], n - 1, dp);
            // exclude
            int ans2 = knapsackmemoization(val, wt, W, n - 1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            dp[n][W] = knapsackmemoization(val, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    // tabulation
    public static int knapsackTabulation(int val[], int wt[], int W, int n, int dp[][]) {
        for (int i = n; i >= 0; i--) {
            for (int j = W; j >= 0; j--) {
                if (j == 0 || i == 0)
                    return 0;
                if (dp[i][j] != -1)
                    return dp[i][j];
                if (wt[i - 1] <= j) {
                    int ans1 = val[i - 1] + dp[i - 1][j - wt[i - 1]];
                    int ans2 = dp[i - 1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                    return dp[i][j];
                } else {
                    return dp[i - 1][j];
                }
            }
        }
        return 0;
    }

    public static void printDp(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int knapsackTabulation2(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++)
            dp[i][0] = 0;
        for (int j = 0; j < dp[0].length; j++)
            dp[0][j] = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];
                if (w <= j) {
                    int incProfit = v + dp[i - 1][j - w];
                    int exProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(incProfit, exProfit);
                } else {
                    int exProfit = dp[i - 1][j];
                    dp[i][j] = exProfit;
                }
            }
        }
        printDp(dp);
        return dp[n][W];
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int dp[][] = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        printDp(dp);
        System.out.println(knapsackTabulation2(val, wt, W));

    }
}