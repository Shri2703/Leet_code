class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}

// Properties of XOR:

// a⊕a=0 (any number XORed with itself is 0)
// 𝑎⊕0=𝑎
// a⊕0=a (any number XORed with 0 is the number itself)
// XOR is commutative and associative, meaning the order of operations does not matter: 

// a⊕b⊕a=a⊕a⊕b=0⊕b=b

// Input: nums = [2,2,1]
// Output: 1