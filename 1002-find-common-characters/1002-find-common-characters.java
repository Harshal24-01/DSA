class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();

        int[] common = new int[26];

        for (char ch : words[0].toCharArray()) {
            common[ch - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {

            int[] freq = new int[26];

            for (char ch : words[i].toCharArray()) {
                freq[ch - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                common[j] = Math.min(common[j], freq[j]);
            }
        }

        for (int i = 0; i < 26; i++) {

            while (common[i] > 0) {
                ans.add(String.valueOf((char) (i + 'a')));
                common[i]--;
            }
        }

        return ans;
    }
}