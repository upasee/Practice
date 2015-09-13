/* Given an array of integers, Find two numbers, such that they add up to a specific target  */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++) {
            if(hm.containsKey(nums[i])) {
                int index = hm.get(nums[i]);
                result[0] = index+1;
                result[1] = i+1;
                break;
            }
            hm.put(target-nums[i],i);
        }
        return result;
    }
}