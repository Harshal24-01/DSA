class Solution {
    public int CalNextInd(int[] nums, int curr) {
        int next = curr;
        int seq = nums[curr];

        if (seq > 0) {
            // positive rotation
            next = (next + seq) % nums.length;
        } else {
            // negative rotation
            int mod = seq % nums.length;
            int forward = mod + nums.length;
            next = (curr + forward) % nums.length;
        }
        return next;
    }

    public boolean circularArrayLoop(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> set = new HashSet<>();
            // set -> indexes visited so far
            // flag -> is positive if nums[i] > 0 or all negative
            set.add(i);
            boolean isPos = nums[i] > 0;
            // cycle detection
            int curr = i;

            while (true) {
                int next = CalNextInd(nums, curr);
                if (isPos) {
                    if (nums[next] < 0) {
                        break;
                    } else {
                        if (set.contains(next)) {
                            // cycle exisys
                            if (curr != next) {
                                return true;
                            } else {
                                break;
                            }
                        }
                        set.add(next);
                    }
                } else {
                    if (nums[next] > 0) {
                        break;
                    } else {
                        if (set.contains(next)) {
                            // cycle exisys
                            if (curr != next) {
                                return true;
                            } else {
                                break;
                            }
                        }
                        set.add(next);
                    }
                }
                curr = next;
            }
        }
        return false;
    }
}