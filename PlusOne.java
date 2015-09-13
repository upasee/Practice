/*  
    Given a non-negative number represented as an array of digits, plus one to the number.
    The digits are stored such that the most significant digit is at the head of the list. 

*/

public class PlusOne {
    public int[] plusOne(int[] arr) {
        int carry=1;
        for(int i=arr.length-1;i>=0;i--) {
            if((carry+arr[i]) >= 10) {
                arr[i] = 0;
                carry=1;
            }
            else {
                carry=0;
                arr[i]+=1;
                break;
            }
        }
        if(carry == 1) {
            int[] result = new int[arr.length+1];
            result[0] = 1;
            for(int i=1;i<=arr.length;i++) {
                result[i] = arr[i-1];
            }
            return result;
        }
        else
            return arr;
    }
}