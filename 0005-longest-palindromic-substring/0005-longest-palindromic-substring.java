class Solution {

    public String longestPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        StringBuilder sb = new StringBuilder("");

        while (i <= j) {
            int left = i;
            int right = j;
            boolean palindrome = true;

            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    palindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (palindrome) {
                if (j - i + 1 > sb.length()) {
                    sb = new StringBuilder(s.substring(i, j + 1));
                }
                i++;
                j = s.length() - 1;
            } else {
                j--;
            }
        }
        return sb.toString();
    }
}