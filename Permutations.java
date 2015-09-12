/*

Given a string, generate all of its unique permutations
 
*/

public class Permutations {
    public List<Integer> generatePermutations(String prefix, String str, HashSet<String> result) {
        int n = str.length();
        if(n == 0)
            result.add(prefix);
         else {
            for(int i=0;i<n;i++) {
                generatePermutations(prefix+str.charAt(i), str.substring(0, i)+str.substring(i+1, n), result);
            }
        }
        return;
    } 
}