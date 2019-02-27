package LeetCode;

public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        sortArray(arr, 0, n - 1);
        for (int a : arr) {
            System.out.print(a + " ");
        }

    }

    public static void sortArray(int[] a, int low, int high) {

        if (low < high) {
            int pi = partition(a, low, high);

            sortArray(a, low, pi - 1);
            sortArray(a, pi + 1, high);
        }

    }

    public static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, high);
        return i + 1;
    }

    public static void swap(int a[], int from, int to) {
        int temp = a[from];
        a[from] = a[to];
        a[to] = temp;
    }

}
