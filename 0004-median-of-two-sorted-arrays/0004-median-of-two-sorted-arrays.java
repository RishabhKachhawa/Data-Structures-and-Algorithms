class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n  = nums1.length;
        int m = nums2.length;
        int totalelm = n+m;
        int arr[] = new int[totalelm];
        for(int i = 0; i<n; i++){
             arr[i] = nums1[i];
        }
        int idx = 0;
        for(int j = n; j<totalelm; j++){
            arr[j] = nums2[idx];
            idx++;
        }
        Arrays.sort(arr);

        int mid = totalelm/2;
        double ans = 0;

        if(totalelm % 2==0){
            // even case
            ans = (arr[mid]+arr[mid-1]) / 2.0;
        }
        else{
            //odd case
            ans = arr[mid];
        }
        return ans;
    }

}