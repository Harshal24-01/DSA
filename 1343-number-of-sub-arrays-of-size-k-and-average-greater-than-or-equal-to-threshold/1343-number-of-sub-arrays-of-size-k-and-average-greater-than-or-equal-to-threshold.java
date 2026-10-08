class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int thresholdCrosser = 0;
        int i = 0;
        int sum = 0;
        for (int j = 0; j < k; j++) {
            sum = sum + arr[j];

        }
        if (sum / k >= threshold) {
            thresholdCrosser++;
        }
        for (int j = k; j < arr.length; j++) {
            sum = sum + arr[j];
            sum = sum - arr[i];
            if (sum / k >= threshold) {
                thresholdCrosser++;
            }
            i = i + 1;
        }
        return thresholdCrosser;
    }
}