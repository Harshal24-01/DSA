
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] count = new int[1001];

        // Step 1: Count frequency of each element
        for (int num : arr1) {
            count[num]++;
        }

        int index = 0;

        // Step 2: Place elements according to arr2
        for (int num : arr2) {
            while (count[num] > 0) {
                arr1[index] = num;
                index++;
                count[num]--;
            }
        }

        // Step 3: Place remaining elements in ascending order
        for (int num = 0; num < count.length; num++) {
            while (count[num] > 0) {
                arr1[index] = num;
                index++;
                count[num]--;
            }
        }

        return arr1;
    }
}
