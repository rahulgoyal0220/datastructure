package LeetCode;

public class MatrixBombEnemy {

    public static void main(String[] args) {
        String[] s = {"BXEB", "EBEX", "XEXX", "XBXX"};
        System.out.println(allEnemiesKilled(s));
    }

    public static boolean allEnemiesKilled(String[] s) {
        boolean allKilled = false;
        int slen = s.length;
        int z = 0;
        int totalBomb = 0;
        int totalEnemy = 0;
        char[][] matrix = new char[slen][4];
        for (int i = 0; i < matrix.length; i++) {
            if (i < slen) {
                char[] c = s[i].toCharArray();
                for (int y = 0; y < c.length; y++) {
                    if (c[y] == 'B') {
                        totalBomb++;
                    }
                    if (c[y] == 'E') {
                        totalEnemy++;
                    }
                    matrix[i][y] = c[y];
                }
            }
        }
        if (totalBomb > 0 && totalEnemy == 0) {
            return true;
        }
        if (totalBomb == 0 && totalEnemy > 0) {
            return false;
        }
        System.out.println("Total Bomb  = " + totalBomb);
        System.out.println("Total Enemy  = " + totalEnemy);
        for (char[] x : matrix) {
            for (char t : x) {
                System.out.print(t + " ");
            }
            System.out.println(" ");
        }
        for (int w = 0; w < matrix.length; w++) {
            if (totalEnemy != 0 && totalBomb != 0) {
                for (int k = 0; k < matrix[w].length; k++) {
                    if (matrix[w][k] == 'B') {
                        totalBomb--;
                        int d = 0;
                        while (d < matrix.length) {
                            if (matrix[d][k] == 'E') {
                                totalEnemy--;
                                matrix[d][k] = 'X';
                            }
                            d++;
                        }
                        d = 0;
                        while (d < matrix[w].length) {
                            if (matrix[w][d] == 'E') {
                                totalEnemy--;
                                matrix[w][d] = 'X';
                            }
                            d++;
                        }

                    } else {
                        continue;
                    }
                }
            }
        }
        System.out.println("***********************************************\n\n\n");
        System.out.println("Total Bomb  = " + totalBomb);
        System.out.println("Total Enemy  = " + totalEnemy);
        for (char[] x : matrix) {
            for (char t : x) {
                System.out.print(t + " ");
            }
            System.out.println(" ");
        }

        if (totalEnemy == 0) {
            allKilled = true;
        }
        return allKilled;
    }
}
