class Solution {
    public boolean isPalindrome(int x) {
        int check = x;
       int rem = 0;
       int reverse = 0;

        if (x < 0) {
            return false;
        }
       while(x != 0){
        rem = x % 10;
        reverse  = reverse * 10 + rem;
        x = x /10;
       }
       if(check != reverse){
        return false;
       }
    return true;
    }
}