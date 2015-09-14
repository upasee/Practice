/* 

	Rotate an array of n elements to the right by k steps.
	For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

*/

public class RotateArray {
	
	public static void rotate(int[] nums, int k) {
		if(k>=nums.length) {
			k%=nums.length;
		}
		reverse(nums, nums.length - k, nums.length-1);
		reverse(nums, 0, nums.length - (k+1));
		reverse(nums, 0, nums.length-1);
	}
	
	public static void reverse(int[] nums, int left, int right) {
		while(left < right){
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
		}
	}
}
