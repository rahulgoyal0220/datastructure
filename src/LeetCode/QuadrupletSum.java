package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrupletSum {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        System.out.println(fourSum(nums, 0));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            int temp = i;
            int start = temp + 1;
            int second = temp + 2;
            int third = temp + 3;
            int end = nums.length - 3;
            while (temp < end) {
                int sum = nums[i] + nums[start] + nums[second] + nums[third];
                if (sum == target) {
                    List<Integer> rec = new ArrayList<>();
                    rec.add(nums[i]);
                    rec.add(nums[start]);
                    rec.add(nums[second]);
                    rec.add(nums[third]);

                    result.add(rec);
                }
                temp++;
            }

        }
        return result;
    }
}
