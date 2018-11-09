package LeetCode;

public class SortArrayByParity {

    public static void main(String[] args) {

        int[] a = {0};

        int[] ans = sortArrayByParity(a);
        for (int an : ans) {
            System.out.print(an + " ");
        }

    }

    public static int[] sortArrayByParity(int[] A) {
        int[] even = new int[A.length];
        int[] odd = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            even[i] = -1;
            odd[i] = -1;
        }

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                even[evenCount] = A[i];
                evenCount++;
            } else {
                odd[oddCount] = A[i];
                oddCount++;
            }
        }

        int[] ans = new int[evenCount + oddCount];
        int z = 0;
        while (--evenCount >= 0) {
            if (even[evenCount] != -1) {
                ans[z] = even[evenCount];
                z++;
            }
        }
        while (--oddCount >= 0) {
            if (odd[oddCount] != -1) {
                ans[z] = odd[oddCount];
                z++;
            }
        }


        return ans;
    }
}
