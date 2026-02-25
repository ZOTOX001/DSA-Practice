
//34. Find First and Last Position of Element in Sorted Array
//Medium
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
package training;
import java.util.Arrays;
public class leetcode34 {
        public int[] SearchRange( int[] nums, int target){
            int[] ans = {-1, -1};
            ans[0] = search(nums, target, true);
            ans[1] = search(nums, target, false);
            return ans;
        }

        public static int search ( int[] arr, int target, boolean findStartIndex) {
            int ans = -1;
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    ans = mid;
                    if (findStartIndex) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }

            }
            return ans;
        }
    public static void main(String[] args) {

        leetcode34 obj = new leetcode34();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = obj.SearchRange(nums, target);

        System.out.println(Arrays.toString(result));
            }
}