package LeetCode;

public class ConvertArrayToArray {
    public static void main(String[] args) {
        int[] a = {4, 0, 2, 1, 3};

        convertArray(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void convertArray(int[] a) {
        int n = a.length;
        for (int i = 0; i < a.length; i++) {
            a[i] += (a[a[i]] % n) * n;
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i]/n;
        }
    }
}
