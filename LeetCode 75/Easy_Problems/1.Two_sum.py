

'''
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
'''


#SOlution

class Solution(object):
    def twoSum(self, nums, target):
        d1 = {}
        for i in range(0, len(nums)):
            d1[nums[i]] = i 

        for i in range(0,len(nums)):
            x = target - nums[i]
            if x in d1 and i != d1[x]:
                return[i,d1[x]]

        return none      



//java soution 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize the scanner to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Get the size of the array
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        
        // Declare the array and take input
        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Get the target value
        System.out.println("Enter the target value:");
        int target = scanner.nextInt();
        
        // Call the twoSum function
        int[] result = twoSum(nums, target);
        
        // Print the result
        if (result.length == 0) {
            System.out.println("No solution found.");
        } else {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        }

        // Close the scanner
        scanner.close();
    }

    // The twoSum function to find the indices of two numbers that add up to the target
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return the indices if a solution is found
                }
            }
        }
        return new int[]{}; // Return an empty array if no solution is found
    }
}
