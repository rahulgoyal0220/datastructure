package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {
    public static void main(String[] args) {
        int[] a = {1, 0, -1, 0, -2, 2};

        List<List<Integer>> output = fourSum(a, 0);
        for (List<Integer> data : output) {
            data.forEach(rec -> System.out.print(rec + " "));
            System.out.println("");
        }

    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();

        Arrays.sort(nums);
        for (int i : nums) {
            for (int z = 0; z < nums.length; z++) {
                int d = i + nums[z];
            }
        }
        return output;
    }
}
