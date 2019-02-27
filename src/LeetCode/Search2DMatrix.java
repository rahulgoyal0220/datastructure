package LeetCode;

public class Search2DMatrix {

    public static void main(String[] args) {
        int[][] a = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        System.out.println(searchMatrix(new int[4][4], 3));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length > 0) {
                if (target <= matrix[i][matrix[i].length - 1]) {
                    int d = 0;
                    while (d < matrix[i].length) {
                        if (matrix[i][d] == target) {
                            found = true;
                        }
                        d++;
                    }
                    break;
                } else {
                    continue;
                }
            }
        }
        return found;
    }
}
