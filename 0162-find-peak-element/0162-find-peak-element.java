class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int str =0 ;
        int end  = n-1;
        int ans = 0;
        
        if( n == 1 || nums[n-1]>nums[n-2]){
            return n-1;
        }

        while(str<=end){
            int mid = str + (end-str)/2;
            if(nums[mid]>=nums[mid+1]){
                ans = mid;
                end = mid-1;
            }else{
                str = mid+1;
            }
            // int prev =0 ;
            // int  next = 0;
            // if(mid-1 >=0){
            //     prev = mid-1;
            // }
            // if(mid+1 <n){
            //     next = mid+1;

            // }
            // if(nums[mid]>nums[prev] && nums[mid]>nums[next]){
            //     return mid;
            // }else if(nums[mid]> nums[prev] && nums[mid]< nums[next]){
            //     str = mid+1;
            // }else{
            //     ans = mid;
            //     end = mid - 1;
            
        }
      return ans;  
    }
}