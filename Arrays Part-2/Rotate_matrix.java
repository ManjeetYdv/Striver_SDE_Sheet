class Solution {
    public void rotate(int[][] matrix) {
        
        int row =  matrix.length;
        int col = matrix[0].length;
        
        int[][] transpose = new int[row][col];
        
        for(int i=0 ;i<row; i++){
            for(int j=0 ;j<col;j++){
                transpose[j][i] = matrix[i][j];
                
            }
        }
        
        for(int i=0 ;i<row; i++){
            for(int j=0 ;j<col/2;j++){
                int temp =transpose[i][col-1-j];
                transpose[i][col-1-j]= transpose[i][j];
                transpose[i][j] = temp;
            }
        }
        
        for(int i=0 ;i<row ;i++){
            for(int j=0 ;j<col;j++){
                matrix[i][j]= transpose[i][j];
            }
        }
    }
}
