class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int arr[] = new int[k];
        int j = 0;
        k = k % n;
        if(k==0 ){
            return;
        }
        for(int i=n-k; i<n ; i++){
            arr[j] = nums[i];
            j++;
        }

        for(int i = n-k-1; i>=0 ; i-- ){
            nums[i] = nums[i]^nums[i+k];
            nums[i+k] = nums[i]^nums[i+k];
            nums[i] = nums[i]^nums[i+k];
        }

        for(int i = 0; i<k ; i++){
            nums[i] = arr[i];
        }

        
        // System.out.println(Arrays.toString(arr));
        
    }
}