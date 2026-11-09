class Solution {
    public int arrangeCoins(int n) {

        int low = 0;
        int high = n;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long coins = (long) mid * (mid + 1) / 2;
            if (coins <= n) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
}