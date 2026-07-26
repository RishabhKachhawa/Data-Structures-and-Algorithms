class Solution {
    public int maxArea(int[] height) {
        int n =  height.length;
        int i = 0;
        int j = n-1;
        int max = Integer.MIN_VALUE;

        while(i<j){
            int len = j-i;
            int wid = Math.min(height[i],height[j]);
            int Area = len * wid ;
            max = Math.max(max,Area);
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
}