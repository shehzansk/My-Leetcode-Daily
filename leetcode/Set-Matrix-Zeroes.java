class Solution {
    public void setZeroes(int[][] m) {
        // int ans[][] = new int[m.length][m[0].length]; 
        int row[] = new int[m.length];
        int col[] = new int[m[0].length];
        for(int i=0; i<m.length ; i++){
            for(int j=0;j<m[i].length; j++){
                if(m[i][j] == 0){
                row[i] = 1;
                col[j] = 1;
                }
            }  
        }

        for(int i =0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++){
                if((row[i] == 1)||(col[j]==1)){
                    m[i][j] = 0;
                }
            }
        }
    }


}