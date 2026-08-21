class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int max2 = -1;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max2 = max;
                max = nums[i];
                maxIndex = i;
            }
            if (nums[i] < max && nums[i] > max2) {
                max2 = nums[i];
            }
        }
        if (2 * max2 > max) {
            return -1;
        }
        return maxIndex;
    }
}