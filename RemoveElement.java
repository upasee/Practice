/* 
    Given an array and a value, remove all instances of that value in place and return the new length
*/

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int result=0;
        for(int i=0; i<nums.length;i++) {
            if(nums[i] == val) {
                continue;
            }
            nums[result++]=nums[i];
        }
        return result;
    }
}