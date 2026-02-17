package training;

public class Maxsubarray {

    // Return method
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;   // returning value
    }

    // Main method
    public static void main(String[] args) {

        Maxsubarray obj = new Maxsubarray();  // create object

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = obj.maxSubArray(arr);   // calling return method

        System.out.println("Maximum Subarray Sum: " + result);
    }
}