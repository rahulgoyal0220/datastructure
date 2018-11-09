package LeetCode;

public class AnagramMapping {
    public static void main(String[] args) {
        int[] a = {12, 28, 46, 32, 50};
        int[] b= {50, 12, 32, 46, 28};
        int[] answ = anagramMappings(a,b);
        for (int i : answ) {
            System.out.print(i+" ");
        }
    }

    public static int[] anagramMappings(int[] A, int[] B) {
        int[] answ = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    answ[i] = j;
                    break;
                }
            }
        }

        return answ;
    }
}
