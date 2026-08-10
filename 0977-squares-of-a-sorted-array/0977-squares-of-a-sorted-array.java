class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;

        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                squares[k] = nums[i] * nums[i];
                i++;
            } else {
                squares[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }
        return squares;
    }
}