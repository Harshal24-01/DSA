class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0, maxFreq = 0, maxLength = 0;
        int[] freq = new int[26];

        for (int j = 0; j < s.length(); j++) {
            int index = s.charAt(j) - 'A';
            freq[index]++;

            maxFreq = Math.max(maxFreq, freq[index]);

            while ((j - i + 1) - maxFreq > k) {
                freq[s.charAt(i) - 'A']--;
                i++;
            }

            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }
}