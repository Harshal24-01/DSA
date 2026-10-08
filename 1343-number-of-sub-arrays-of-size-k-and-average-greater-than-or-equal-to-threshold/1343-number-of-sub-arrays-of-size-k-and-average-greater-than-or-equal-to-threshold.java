class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int thresholdCrosser = 0;
        int sum = 0;
        for (int j = 0; j < k; j++) {
            sum = sum + arr[j];
        }
        if (sum >= threshold * k) {
            thresholdCrosser++;
        }
        for (int j = k; j < arr.length; j++) {
            sum = sum + arr[j];
            sum = sum - arr[j - k];
            if (sum >= threshold * k) {
                thresholdCrosser++;
            }
        }
        return thresholdCrosser;
    }
}