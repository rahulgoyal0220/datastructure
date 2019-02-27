package LeetCode;

public class Jump {
    public static void main(String[] args) {
        int[] nums = {2,0,0};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {

        boolean status = false;
        int jump = nums[0] - 1;
        if (nums.length == 1) {
            return true;
        } else if(jump < 0) {
            return false;
        }
        while (jump <= nums.length - 1) {
            int next = nums[jump];
            if ((next + jump) == nums.length - 1) {
                status = true;
                break;
            }

            if (next == 0) {

                break;
            }
            jump = next + jump;
        }
        return status;

    }
}
