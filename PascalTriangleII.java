/*

	Given an index k, return the kth row of the Pascal's triangle

*/

public class PascalTriangelII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
		if(rowIndex < 0)
			return result;
		List<Integer> prev = new ArrayList<Integer>();
		List<Integer> curr = new ArrayList<Integer>();
		
		curr.add(1);

		int n=1;

		while(n <= rowIndex) {
			prev = curr;
			curr = new ArrayList<Integer>();
			curr.add(1);
			for(int i=0; i<prev.size()-1;i++) {
				curr.add(prev.get(i)+prev.get(i+1));
			}
			curr.add(1);
			n++;
		}
		result= curr;
		return result;
	}    
}