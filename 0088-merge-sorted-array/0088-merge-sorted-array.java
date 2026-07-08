class Solution {
    public void merge(int[] nums, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums2[j] > nums[i]) {
                nums[k] = nums2[j];
                j = j -1;
            }
            else {
                nums[k] = nums[i];
                i= i- 1;
            }
            k = k -1;
        }
        while (j >= 0) {
        nums[k]= nums2[j];
            k = k -1;
            j = j -1;
        } 
    }
}