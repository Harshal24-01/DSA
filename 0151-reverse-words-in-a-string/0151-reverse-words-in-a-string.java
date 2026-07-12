class Solution {
    public String reverseWords(String s) {
        //__hello__world__
        String trim = s.trim();
        //hello__world
        String[] arr = trim.split("\\s+");
        // [hello,__,world]
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        //[world,__,hello]
        return String.join(" ", arr);
        // world__hello
    }
}