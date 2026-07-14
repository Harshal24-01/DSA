class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;

            for (int k = 0; k < list.size(); k++) {
                if (list.get(k) == nums1[i]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    break;
                }
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}