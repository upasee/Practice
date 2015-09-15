public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n <= 0)
            return;
        int alen = m-1;
        int blen = n-1;
        for(int i=m+n-1; i>=0; i--) {
            if(blen < 0 || (alen >= 0 && nums1[alen] > nums2[blen])) {
                nums1[i] = nums1[alen--];
            }
            else {
                nums1[i] = nums2[blen--];
            }
    }
    }
}