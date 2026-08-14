class Solution {
    public boolean validMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if(arr.length < 3){
            return false;
        }
        while(start < end && arr[start] < arr[start+1]){
            start++;
        }
         while(end > 0 && arr[end] < arr[end-1]){
            end--;
        }
        return start == end && start != 0 && end != arr.length-1;
    }
}