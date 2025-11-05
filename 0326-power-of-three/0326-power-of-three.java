class Solution {
    public boolean isPowerOfThree(int n) {
        int max3=1162261467;
        return n>0 && max3%n==0;

        
    }
}