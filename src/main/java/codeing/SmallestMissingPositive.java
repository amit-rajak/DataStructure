package codeing;

public class SmallestMissingPositive {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 0};
        System.out.println(findSmallestMissingPositive(nums1)); // Output: 3

        int[] nums2 = {7, 8, 9, 11, 12};
        System.out.println(findSmallestMissingPositive(nums2)); // Output: 1

        int[] nums3 = {3, 4, -1, 1};
        System.out.println(findSmallestMissingPositive(nums3)); // Output: 2
    }

    public static int findSmallestMissingPositive(int[] nums) {
        int n = nums.length;

        // Move each element to its correct position
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        // Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all positive integers are present, return the next positive integer
        return n + 1;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
