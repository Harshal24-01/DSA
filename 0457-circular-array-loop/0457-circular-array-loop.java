class Solution {

    public int CalNextInd(int[] nums, int curr) {
        int next = ((curr + nums[curr]) % nums.length + nums.length) % nums.length;
        return next;
    }

    public boolean circularArrayLoop(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                continue;
            }

            boolean isPos = nums[i] > 0;

            int slow = i;
            int fast = i;
            int curr = i;

            while (true) {

                // Move slow one step
                slow = CalNextInd(nums, slow);

                if (isPos) {
                    if (nums[slow] < 0)
                        break;
                } else {
                    if (nums[slow] > 0)
                        break;
                }

                // Move fast one step
                fast = CalNextInd(nums, fast);

                if (isPos) {
                    if (nums[fast] < 0)
                        break;
                } else {
                    if (nums[fast] > 0)
                        break;
                }

                // Move fast second step
                fast = CalNextInd(nums, fast);

                if (isPos) {
                    if (nums[fast] < 0)
                        break;
                } else {
                    if (nums[fast] > 0)
                        break;
                }

                if (slow == fast) {

                    // Ignore one-element loop
                    if (slow == CalNextInd(nums, slow))
                        break;

                    return true;
                }
            }

            // Mark visited nodes as 0
            if (isPos) {

                while (nums[curr] > 0) {
                    int next = CalNextInd(nums, curr);
                    nums[curr] = 0;
                    curr = next;
                }

            } else {

                while (nums[curr] < 0) {
                    int next = CalNextInd(nums, curr);
                    nums[curr] = 0;
                    curr = next;
                }
            }
        }

        return false;
    }
}