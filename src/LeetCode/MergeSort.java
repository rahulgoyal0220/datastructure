package LeetCode;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {3, 5, 1, 2, 30, 10, 55, 11, 14, 66};
        sort(a, 0, (a.length - 1));
        for (int i : a) {
            System.out.print(i + " ");
        }
    }


    private static void sort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sort(a, l, m);
            sort(a, m + 1, r);

            merge(a, l, m, r);
        }

    }

    private static void merge(int[] arr, int l, int m, int r) {
        int[] temp = new int[r - l + 1];

        int i = l;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= m) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= r) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (int z = l; z <= r; z++) {
            arr[z] = temp[z - l];
        }
    }
}
