class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int[] vowelCounts = new int[n]; // Array to store vowel counts
        
        // Populate the vowelCounts array
        for (int i = 0; i < n; i++) {
            vowelCounts[i] = isVowel(s.charAt(i)) ? 1 : 0;
            if (i > 0) {
                vowelCounts[i] += vowelCounts[i - 1]; // Cumulative count of vowels
            }
        }
        
        int maxVowelCount = 0;
        // Calculate maximum vowel count in substrings of length k
        for (int i = k - 1; i < n; i++) {
            int currentCount = vowelCounts[i];
            if (i >= k) {
                currentCount -= vowelCounts[i - k]; // Remove count of vowels outside the window
            }
            maxVowelCount = Math.max(maxVowelCount, currentCount);
        }
        
        return maxVowelCount;
    }
    
    // Helper method to check if a character is a vowel
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
