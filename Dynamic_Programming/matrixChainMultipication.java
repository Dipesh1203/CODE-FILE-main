public class matrixChainMultipication {
    // recursion
    public static int mcm(int arr[], int i, int j) {
        if (i == j)
            return 0;
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = mcm(arr, i, k);
            int cost2 = mcm(arr, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalcost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalcost);
        }
        return ans;
    }

    // memoization
    public static int mcmMemoization(int arr[], int dp[][], int i, int j) {
        if (i == j)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = mcmMemoization(arr, dp, i, k);
            int cost2 = mcmMemoization(arr, dp, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalcost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalcost);
        }
        return dp[i][j] = ans;
    }

    // tabulation
    public static int mcmTabulation(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }

        /// bottom up
        for (int len = 2; len <= n - 1; len++) {
            for (int i = 1; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k + 1][j];
                    int cost3 = arr[i - 1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost1 + cost2 + cost3);
                }
            }
        }
        printarr(dp);
        return dp[1][n - 1];
    }

    public static void printarr(int arr[][]) {
        for (int index = 0; index < arr.length; index++) {
            for (int i = 0; i < arr[0].length; i++) {
                System.out.print(arr[index][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3 };// n
        int n = arr.length;
        int dp[][] = new int[n][n];
        System.out.println(mcm(arr, 1, n - 1));
        System.out.println(mcmTabulation(arr));
        ;
    }
}
