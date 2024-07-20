class Solution {
    public void moveZeroes(int[] nums) {
        // Pointer to keep track of the position of the last non-zero element
        int lastNonZeroFoundAt = 0;

        // Iterate through the array
        for (int current = 0; current < nums.length; current++) {
            // If the current element is not zero, move it to the position of lastNonZeroFoundAt
            if (nums[current] != 0) {
                // Swap the elements
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[current];
                nums[current] = temp;
                
                // Increment lastNonZeroFoundAt
                lastNonZeroFoundAt++;
            }
        }
    }
}
