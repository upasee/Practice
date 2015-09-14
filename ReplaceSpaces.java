/*

	Replace the spaces with "%20" in a string

*/

public class ReplaceSpaces {

	public void replaceSpaces(char[] str, int length) {
		int count1=0;
		for (int i=0;i<length;i++) {
			if(str[i] == ' ')
				count1++;
		}
		int count2 = length + 2*count1;
		int j = count2-1;
		for(int i=length-1;i>=0;i--) {
			if(str[i] == ' ') {
				str[j] = '0';
				str[j-1] = '2';
				str[j-2] = '%';
				j-=3;
			}
			else {
				str[j--] = str[i];
			}
		}
	}

}
