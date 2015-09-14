/* Check whether two strings are permutations of each other */

public class Permutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First string : ");
		String str1 = sc.nextLine();
		System.out.println("Second string : ");
		String str2 = sc.nextLine();
		sc.close();
		boolean res = permutation2(str1, str2);
		System.out.println("Result is "+res);
		
	}
	
	static String sort(String s) {
		char[] temp = s.toCharArray();
		Arrays.sort(temp);
		return new String(temp);
	}
	
	public static boolean permutation1(String str1, String str2) {
		if(str1.length()!=str2.length())
			return false;
		return sort(str1).equals(sort(str2));
	}
	
	public static boolean permutation2(String str1, String str2) {
		if(str1.length()!=str2.length())
			return false;
		int[] letters = new int[128];
		for(int i=0;i<str1.length();i++) {
			char c = str1.charAt(i);
			letters[c]++;
		}
		for(int i=0;i<str2.length();i++) {
			char c = str2.charAt(i);
			letters[c]--;
			if(letters[c]<0)
				return false;
		}
		return true;
	}

}
