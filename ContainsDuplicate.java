/*
    
    Given an array of integers, find if the array contains any duplicates

*/

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++) {
            if(!hs.contains(nums[i])) {
                hs.add(nums[i]);
            }
            else 
                return true;
        }
        return false;
    }
}