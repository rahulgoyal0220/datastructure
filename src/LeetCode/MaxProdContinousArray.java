package LeetCode;

public class MaxProdContinousArray {

    public static void main(String[] args) {
        int[] a = {-2, 3, 0};

        int asciiVal = '@';
        System.out.println(asciiVal);
    }


    public static int maxProduct(int[] nums) {
        int localMax = nums[0];
        int localMin = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                localMax = Math.max(localMax * nums[i], nums[i]);
                localMin = Math.min(localMin * nums[i], nums[i]);
            } else {
                int maxNeg = Math.max(localMin * nums[i], nums[i]);
                localMin = Math.min(localMax * nums[i], nums[i]);
                localMax = maxNeg;
            }

            max = Math.max(max, localMax);
        }

        return max;

    }
}
