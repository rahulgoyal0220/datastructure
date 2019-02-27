package LeetCode;

public class ContainerMostWater {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {

        int maxArea = 0;
        int length = height.length;
        int tempLength = length;

        for (int i = 0; i < length; i++) {
            for (int distance = length - 1 - i; distance > 0; distance--) {
                tempLength = tempLength -1;
                int maxHeight = height[i] > height[tempLength] ? height[tempLength] : height[i];
                int tempMaxArea = maxHeight * distance;
                if (maxArea > tempMaxArea) {
                    continue;
                } else {
                    maxArea = tempMaxArea;
                }
            }
            tempLength = length;
        }
        return maxArea;
    }


}
