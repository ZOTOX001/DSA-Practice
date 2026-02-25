// 239. Sliding Window Maximum
//Hard
//Topics
//premium lock icon
//Companies
//Hint
//You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
//
//Return the max sliding window.
package training;
import java.util.*;

public class slidingwindow {
    public static int[] slidingwindow(int[] nums, int k) {
        int n = nums.length;

        if (n == 0 || k > n) return new int[0];

        int[] result = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int max = nums[i];

            for (int j = 1; j < k; j++) {
                max = Math.max(max, nums[i + j]);
            }

            result[i] = max;
        }

        return result;
    }

    // Main method to run locally
    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = slidingwindow(nums, k);

        System.out.println("Sliding Window Maximums:");
        System.out.println(Arrays.toString(result));
    }
}