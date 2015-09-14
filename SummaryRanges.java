/*  
    Given a sorted integer array without duplicates, return the summary of its ranges.
    For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].

*/

public class SummaryRanges {
    public List<String> summaryRanges(int[] arr) {
        List<String> result = new ArrayList<String>();
        if (arr == null || arr.length == 0)
            return result;
        int prev = arr[0];
        int flag = 1;
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (prev == (arr[i] - 1)) {
                prev = arr[i];
                continue;
            } else {
                flag = 1;
                if (first != prev)
                    result.add(first + "->" + prev);
                else
                    result.add(String.valueOf(prev));
                prev = arr[i];
                first = arr[i];
            }
        }
        if (first == prev) {
            result.add(String.valueOf(first));
        } else {
            result.add(first + "->" + prev);
        }

        return result;
    }
}