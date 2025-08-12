class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result= nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int a=i+1;
            int b=nums.length-1;
            while(a<b){
                int currentsum= nums[a]+nums[i]+nums[b];
                if(currentsum > target){
                    b--;
                }else{
                    a++;
                }
                if(Math.abs(currentsum-target)<Math.abs(result-target)){
                    result=currentsum;
                }
            }

        }
     return result;   
    }
}