class Solution {
    public String reverseByType(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        // First: Reverse letters
        while (left < right) {

            while (left < right && !Character.isLetter(arr[left])) {
                left++;
            }

            while (left < right && !Character.isLetter(arr[right])) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        left = 0;
        right = arr.length - 1;

        // Second: Reverse special characters
        while (left < right) {

            while (left < right && Character.isLetter(arr[left])) {
                left++;
            }

            while (left < right && Character.isLetter(arr[right])) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}