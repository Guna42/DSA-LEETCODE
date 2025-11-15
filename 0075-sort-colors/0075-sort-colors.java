
class Solution {
    public void sortColors(int[] nums) {
        
        int i=0;
        int z=0;
        int o=0;
        int t=0;
        for (int num : nums) {
            if (num == 0) z++;
            else if (num == 1) o++;
            else t++;
        }
      
        while(z-->0){
            nums[i++] = 0;
        }
         while(o-->0){
             nums[i++] = 1;
        }
        while(t-->0){
             nums[i++] = 2;
        }
        
    }
}