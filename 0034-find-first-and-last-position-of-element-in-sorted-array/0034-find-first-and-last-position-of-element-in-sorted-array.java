class Solution {
    public int lowerBound(int[] nums, int target , int str , int end){
        int ans =-1;
        while(str<=end){
            int mid = str + (end-str)/2;
            if(target==nums[mid]){
                ans = mid;
                end = mid-1;
            }else if(target<nums[mid]){
                end = mid-1;
            }
            else{
                str = mid+1;
            }
        }
        return ans ;
    }
    public int upperBound(int[] nums,int target,int str,int end){
        int ans = -1;
        while(str<=end){
            int mid = str+(end-str)/2;
            if(target==nums[mid]){
                ans = mid;
                str = mid+1;
            }else if(nums[mid]<target){
                str = mid +1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int str =0;
        int end = nums.length-1;
        
        int arr[] = new int[2];

        arr[0]=lowerBound(nums,target, str , end);
        arr[1]=upperBound(nums,target, str , end);

      return arr;  
    }
}