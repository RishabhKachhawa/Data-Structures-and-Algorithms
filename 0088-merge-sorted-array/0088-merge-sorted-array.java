class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m;
        int j =0;
        while(index<m+n){
            nums1[index] = nums2[j];
            index++;
            j++;

        }
        Arrays.sort(nums1);
    }
}