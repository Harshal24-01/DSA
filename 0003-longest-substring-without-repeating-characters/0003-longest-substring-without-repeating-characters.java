class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        int len = 0;
        Set<Character> set = new HashSet<>();
        while(j < s.length()){
            char c = s.charAt(j);
            while(set.contains(c)){
                set.remove(s.charAt(i));
                i = i + 1;
            }
            set.add(c);
            len = Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}