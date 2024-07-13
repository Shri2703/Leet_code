class Solution {
    public void rotate(int[] nums, int k) {
        // Get the length of the array
        int n = nums.length;

        // Ensure k is within the bounds of the array length
        // If k is greater than n, rotating by k is the same as rotating by k % n
        k = k % n;

        // Step 1: Reverse the entire array
        // This will make the end of the array move to the beginning and the beginning move to the end
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        // This will place the first k elements in their correct positions
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining n - k elements
        // This will place the remaining elements in their correct positions
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse a portion of the array
    private void reverse(int[] nums, int start, int end) {
        // Swap the elements from start to end until the two pointers meet in the middle
        while (start < end) {
            // Swap the elements at the start and end pointers
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move the start pointer forward and the end pointer backward
            start++;
            end--;
        }
    }
}



// Explanation of the Reverse Method:
// Reverse the Entire Array:
// Input: [1, 2, 3, 4, 5, 6, 7]
// Output after reversing: [7, 6, 5, 4, 3, 2, 1]
// Reverse the First k Elements:
// k = 3, so reverse the first 3 elements: [7, 6, 5]
// Output after reversing: [5, 6, 7, 4, 3, 2, 1]
// Reverse the Remaining n - k Elements:
// Reverse the elements from index 3 to the end: [4, 3, 2, 1]
// Output after reversing: [5, 6, 7, 1, 2, 3, 4]