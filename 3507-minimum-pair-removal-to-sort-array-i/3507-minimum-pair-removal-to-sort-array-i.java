class Solution {
    public int minimumPairRemoval(int[] nums) {
         int count = 0;

        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }

        while (!isSorted(list)) {

            int minSum = Integer.MAX_VALUE;
            int index = 0;

            for (int i = 0; i < list.size() - 1; i++) {

                int sum = list.get(i) + list.get(i + 1);

                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }

            list.set(index, minSum);
            list.remove(index + 1);

            count++;
        }

        return count;
    }

    public boolean isSorted(List<Integer> list) {

        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
}