/*

	Check whether a String has all the unique characters or not

*/

public class UniqueCharacters {

	public boolean isUnique(String inp) {
		if (inp.length() >= 128)
			return false;
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i < inp.length(); i++) {
			if (hs.contains(inp.charAt(i))) {
				return false;
			} else
				hs.add(inp.charAt(i));
		}
		return true;

	}

}
