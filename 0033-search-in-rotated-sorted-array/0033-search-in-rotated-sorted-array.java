class Solution {
    public int min(int[] nums){
         int n = nums.length;
        int str = 0;
        int end = n-1;
        int ans = -1;
        while(str<=end){
            int mid = str+(end-str)/2;
            if(nums[mid]<=nums[n-1]){
                ans = mid;
                end = mid-1;
            }else{
                str = mid+1;

            }
        }
        return ans;
    }
    public int binary(int[]nums , int target , int str , int end){
        int ans = -1;
        while(str<=end){
            int mid = str+(end-str)/2;
            if(nums[mid]==target){
                return  mid;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                str = mid +1;
            }
        }
        return ans;
    }
    
    public int search(int[] nums, int target) {
        int n = nums.length;
        int ans = -1;
        

        if(n==1){
            if(nums[0] == target){
                return 0;
            }else{
                return -1;
            }
        }
        

        int low = min(nums);
        int end = n-1;

        int k = low-1;
        int str = 0;

        if(nums[str]<nums[end]){
          ans =  binary(nums , target , str , end );
          return ans;
        }
        
        if(low==0){
            ans = binary(nums, target , str , end);
        }
        
        if( target >= nums[low] && target<=nums[end]){
            ans = binary(nums , target , low , end  );
        }else if(target >= nums[str] && target<= nums[k]){
            ans = binary(nums , target , str , k);
        }else{

        }


        return ans ;    
        
    }
}