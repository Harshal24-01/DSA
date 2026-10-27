class Solution {
    public int maxFrequency(int[] nums, int k) {
        int freq = 0;
        int i = 0, j = 0;
        long sum = 0;
        Arrays.sort(nums);
        while (j < nums.length) {
            sum = sum + nums[j];
            while ((long)nums[j] * (j - i + 1) - sum > k) {
                sum = sum - nums[i];
                i = i + 1;
            }
            freq = Math.max(freq, j - i + 1);
            j = j + 1;
        }
        return freq;

    }
}