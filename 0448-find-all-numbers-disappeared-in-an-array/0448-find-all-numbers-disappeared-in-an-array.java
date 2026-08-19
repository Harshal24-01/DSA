class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int currNum = Math.abs(nums[i]);
            int idx = currNum - 1;

            if(nums[idx] < 0){
                continue;
            }
            nums[idx] = -1 * nums[idx];
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] > 0){
                list.add(j+1);
            }
        }
        return list;
    }
}