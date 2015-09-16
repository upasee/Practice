import java.util.Scanner;

public class lucky {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int k = no;
		int count = 0;
		int[] output = new int[no];
		while (k > 0) {
			int sets = sc.nextInt();
			int tempmax = 0;
			for (int i = 0; i < sets; i++) {
				String inp = sc.next();
				if (isLucky(inp)) {
					tempmax++;
				}
			}
			output[count++] = tempmax;
			k--;
		}
		sc.close();
		for (int i = 0; i < no; i++) {
			System.out.println(output[i]);
		}
	}

	public static boolean isLucky(String s) {
		int[] chars = new int[3];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 's') {
				chars[0]++;
			} else if (s.charAt(i) == 'b') {
				chars[1]++;
			} else if (s.charAt(i) == 'u') {
				chars[2]++;
			}
		}
		for (int i = 0; i < 3; i++) {
			if (chars[i] <= 0)
				return false;
		}
		return true;
	}
}
