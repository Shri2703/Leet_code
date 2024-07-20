// The problem can be solved using a simple greedy algorithm. The key observation is that to maximize profit, you should capture all upward movements in the stock prices. Here's how you can think about it:

// Iterate through the price list: Go through each price one by one.
// Capture all upward trends: Whenever the price of the stock goes up from one day to the next, add the difference to your total profit.

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;// declar the variable to store the maxprofit value

        for (int i = 1; i < prices.length; i++) {// iterate to the loop till all the element in the array
            if (prices[i] > prices[i - 1]) {//check the price of current and the next position and if the curent is lesser than the next go to the condition
                maxProfit += prices[i] - prices[i - 1];//calculate the max profit that you can get by tha current and the next element and store it the variable
            }
        }

        return maxProfit;// return the hign profit you can get it by the array of value
    }
}

// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 7
// Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
// Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
// Total profit is 4 + 3 = 7.