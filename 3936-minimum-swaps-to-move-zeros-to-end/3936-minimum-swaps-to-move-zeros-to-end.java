class Solution {
    public int minimumSwaps(int[] nums) {

        int zeros = 0;

        for (int num : nums) {
            if (num == 0) {
                zeros++;
            }
        }

        int swaps = 0;

        for (int i = 0; i < nums.length - zeros; i++) {
            if (nums[i] == 0) {
                swaps++;
            }
        }

        return swaps;
    }
}