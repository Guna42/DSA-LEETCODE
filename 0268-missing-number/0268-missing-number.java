class Solution {
    public int missingNumber(int[] nums) {
        int s=0;
        for(int i : nums) s+=i;
        int allSum=((nums.length)*(nums.length+1))/2;
        return allSum-s;
    }
}