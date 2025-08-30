class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[1001];
        for (int num : nums1) 
            seen[num] = true;

        int[] res = new int[nums1.length];
        int k=0;

        for (int num : nums2)
            if (seen[num] == true) {
                seen[num] = false;
                res[k++] = num;
            }

        return Arrays.copyOfRange(res,0,k);
    }
}