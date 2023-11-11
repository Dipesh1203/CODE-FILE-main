import java.util.*;

public class climbingStairs {
    public static int countWays(int n, int arr[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (arr[n] != -1) {
            return arr[n];
        }
        return countWays(n - 1, arr) + countWays(n - 2, arr);
    }

    public static int countWaysTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

        }
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 5;
        int arr[] = new int[n + 1];
        Arrays.fill(arr, -1);
        System.out.println(countWays(n, arr));
        System.out.println(countWaysTab(n));

    }
}
