class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        
        for(int i = 0 ; i<n-2; i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    Collections.sort(temp);
                    result.add(temp);
                }
                if(sum>=0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return new ArrayList<>(result) ;
    }
}