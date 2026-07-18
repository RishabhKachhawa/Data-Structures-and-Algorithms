class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;

        // firest we transpose the matriix;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<m ; j++){
                matrix[i][j] =  matrix[i][j] ^ matrix[j][i];
                matrix[j][i] =  matrix[i][j] ^ matrix[j][i];
                matrix[i][j] =  matrix[i][j] ^ matrix[j][i];
            }
        }


        for(int i =0; i<n ; i++){
            int str = 0 ;
            int end = m-1;
            while(str<end){
                matrix[i][str] =  matrix[i][str] ^ matrix[i][end];
                matrix[i][end] =  matrix[i][str] ^ matrix[i][end];
                matrix[i][str] =  matrix[i][str] ^ matrix[i][end];

                str++;
                end--;
            }
        }
    }
}