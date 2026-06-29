class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int j = i+1;
        while(j<n){
        if(nums[i]!=nums[j]){
            i++;
            j++;
        }else{
            return nums[i];
        }
        }
        

       return -1;
    }
}