package LeetCode;

public class MaxHourGlassSum {

    public static void main(String[] args) {
        int[][] a = {{1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};
        System.out.println(hourglassSum(a));
    }

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max = -212121;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int z = 0; z < arr[i].length - 2; z++) {
                int sum = arr[i][z] + arr[i][z + 1] + arr[i][z + 2]
                        + arr[i + 1][z + 1]
                        + arr[i + 2][z] + arr[i + 2][z + 1] + arr[i + 2][z + 2];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

}
