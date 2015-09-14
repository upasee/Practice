/*

	Check whether a String is a permutation of a palindrome

*/

public class PalindromePermutation {

	public boolean isPermutation(String inp) {
		int[] charCount = new int[128];
		boolean one=false;
		for(int i=0;i<inp.length();i++) {
			charCount[inp.charAt(i)]++;
		}
		for(int i=0;i<128;i++) {
			if(charCount[i] % 2 != 0) {
				if(one)
					return false;
				one=true;
			}
		}
		return true;
	}
	
}
