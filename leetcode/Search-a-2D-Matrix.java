class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0 ; i<row; i++){

            if(target <= matrix[i][col-1]){
                for(int j =0; j<col; j++){
                    if(target == matrix[i][j]) return true;
                }
            } 
            
        }

        return false;
    }
}