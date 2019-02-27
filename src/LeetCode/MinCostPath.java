package LeetCode;

public class MinCostPath {

    public static void main(String[] args) {

    }

    public static int minCost(int[][] a, int m, int n) {

        int[][] tc = new int[m + 1][n + 1];
        tc[0][0] = a[0][0];

        //initialize the first col
        for (int i = 1; i <= m; i++) {
            tc[i][0] = tc[i - 1][0] + a[i][0];
        }
        //first row
        for (int i = 1; i <= n; i++) {
            tc[0][i] = tc[0][i - 1] + a[0][i];
        }

        //construct rest of the array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                tc[i][j] = min(tc[i - 1][j], tc[i][j - 1], tc[i - 1][j - 1]) + a[i][j];
            }
        }

        return tc[m][n];

    }

    private static int min(int x, int y, int z) {
        if (x < y)
            return (x < z) ? x : z;
        else
            return (y < z) ? y : z;
    }
}
