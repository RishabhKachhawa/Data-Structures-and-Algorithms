class Solution {
    public int findMin(int[] nums) {
        int n = nums.length-1;
        int str = 0;
        int end = n;
        int ans = n;
        while(str<=end){
            int mid = str+(end-str)/2;
            if(nums[mid]<nums[n]){
                ans = mid;
                end = mid-1;
            }else{
                str = mid+1;
            }

        }
        return nums[ans];
    }
}