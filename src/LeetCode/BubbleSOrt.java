package LeetCode;

public class BubbleSOrt {

    public static void main(String[] args) {
        int[] a = {4, 1, 6, 10, 13, 1, 5, 1, 6, 9};
        insertionSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }

    }

    public static void sort(int[] a) {

        while (true) {
            boolean isSwap = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
    }


    public static void insertionSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int j = i;

            while (j > 0 && temp < a[j - 1]) {
                a[j] = a[j - 1];
                j = j - 1;
            }
            a[j] = temp;
        }

    }
}
