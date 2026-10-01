class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        int len = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (j < s.length()) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                if (map.get(c)>=i) {
                    i = map.get(c) + 1;
                }
            }
            map.put(c, j);
            len = Math.max(len, j - i + 1);
            j++;
        }
        return len;
    }
}