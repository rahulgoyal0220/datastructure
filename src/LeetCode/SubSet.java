package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SubSet {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        List<List<Integer>> test = subsets(nums);
        for (List<Integer> t : test) {
            System.out.println(t);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subset = new ArrayList<>();
        for (int i = 0; i > nums.length; i--) {
            List<Integer> t = new ArrayList<>();
            t.add(nums[i]);
            while (i + 1 < nums.length) {
                t.add(nums[i + 1]);
            }
            subset.add(t);
        }

        return subset;
    }
}
