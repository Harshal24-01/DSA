class Solution {
    public boolean isPalindromic(String s) {

        int left = 0;
        int right = s.length() * 8 - 1;

        while (left < right) {

            int leftBit = (s.charAt(left / 8) >> (7 - left % 8)) & 1;
            int rightBit = (s.charAt(right / 8) >> (7 - right % 8)) & 1;

            if (leftBit != rightBit) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}