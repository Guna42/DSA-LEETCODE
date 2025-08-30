class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        HashSet<Integer> set = new HashSet();
        
         while(j< nums1.length && i < nums2.length){
            if(nums1[j]<nums2[i]){
                j++;
            }else if(nums1[j]>nums2[i]){
                i++;
            }else{
                set.add(nums1[j]);
                i++;
                j++;
            }
         
         }
         int[] res = new int[set.size()];
         int k=0;
         for(int nums: set){
            res[k]=nums;
            k++;
            
         }

     return res;  
    }
}