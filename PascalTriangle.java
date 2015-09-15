/*

	Given numRows, generate the first numRows of Pascal's triangle

*/

public class PascalTriangle {
    public List<List<Integer>> listElements(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(numRows <= 0)
			return result;
		List<Integer> prev = new ArrayList<Integer>();
		List<Integer> curr = new ArrayList<Integer>();
		
		curr.add(1);
		result.add(curr);
			
		if(numRows == 1) {
			return result;
		}


		int n=2;

		while(n <= numRows) {
			prev = curr;
			curr = new ArrayList<Integer>();
			curr.add(1);
			for(int i=0; i<prev.size()-1;i++) {
				curr.add(prev.get(i)+prev.get(i+1));
			}
			curr.add(1);
			result.add(curr);
			n++;
		}
		return result;
	}
}