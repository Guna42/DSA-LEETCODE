class Solution {
    public boolean isPalindrome(int x) {
        int res=x;
        int nums=0;
        int ans=0;
        while(res!=0){
            nums=res%10;
            ans=ans*10+nums;
            res=res/10;
        }
        return (x>=0 && ans==x)?true:false;
        
    }
}