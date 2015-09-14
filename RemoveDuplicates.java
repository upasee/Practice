/* 

    Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length. 

*/

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int result=1;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++) {
            if(prev == nums[i]) {
                continue;
            }
            nums[result++]=nums[i];
            prev=nums[i];
        }
        return result;
    }
}