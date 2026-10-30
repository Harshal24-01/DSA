class Solution {
    public double minimumAverage(int[] nums) {

        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;

        double minAvg = Double.MAX_VALUE;

        while (i < j) {

            double avg = (nums[i] + nums[j]) / 2.0;

            minAvg = Math.min(minAvg, avg);

            i++;
            j--;
        }

        return minAvg;
    }
}
