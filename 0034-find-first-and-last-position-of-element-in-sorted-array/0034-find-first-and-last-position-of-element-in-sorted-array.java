import java.util.*;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        Arrays.sort(nums);
        
        int c = 0;
        int f = 0;

        for (int n = 0; n < nums.length; n++) {
            if (nums[n] == target && c == 0) {
                f = n;
            }
            
            if (nums[n] == target) {
                c++;
            }
        }

        if (c == 0) {
            return new int[]{-1, -1};
        }

        return new int[]{f, f + c - 1};
    }
}
