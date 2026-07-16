class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int ans[] = new int [2];
        int str =0;
        int end =n-1;
        while(str<=end){
            int sum = numbers[str]+numbers[end];
            if(sum == target){
                ans[0] = str+1;
                ans[1] = end+1;
                return ans; 
            }else if(sum < target){
                str++;
            }else{
                end--;
            }
        }
        return ans;
    }
}