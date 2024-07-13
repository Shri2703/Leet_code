class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;// if the given array is empty array are not check

        int k = 1; // Index for the next unique element
        //loop to the each array to find the duplicates
        for (int i = 1; i < nums.length; i++) {//start from the 1 to length of the array
            if (nums[i] != nums[i - 1]) {//checking the current element in the array is equal to the next element are not 
                nums[k] = nums[i];//if true adding that element into the array 
                k++;// then incesing the pointer
            }
        }

        return k;// if it reach the all element in the array then it will return the k array of non duplicate element
    }
}


// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).