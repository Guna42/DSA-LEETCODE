class Solution {
    public int maxSubArray(int[] nums) {
        
        int m=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<nums.length;i++){
            cs+=nums[i];
            if(m<cs){
                m=cs;
            }
            if(cs<0){
                cs=0;
            }
        }
        
            
        
            

    return m;
        
    }
}