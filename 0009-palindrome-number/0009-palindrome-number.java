class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
      int temp = x;
        int a =0;
        while(temp!=0){
            int b = temp % 10;
            a=(a*10)+b;
            temp=temp/10;
        }  
        return a == x;
        }
}