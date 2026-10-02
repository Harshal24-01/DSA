class Solution {
    public int maxVowels(String s, int k) {
        int vowelCount = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowelCount++;
            }
        }
        int maxvowelCount = vowelCount;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowelCount++;
            }
            if (isVowel(s.charAt(i - k))) {
                vowelCount--;
            }
            maxvowelCount = Math.max(maxvowelCount, vowelCount);
        }
        return maxvowelCount;
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}