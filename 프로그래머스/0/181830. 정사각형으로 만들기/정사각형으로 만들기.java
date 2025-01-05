class Solution {
     public int[][] solution(int[][] arr) {
        int col = arr[0].length;
        int row = arr.length;
        int arrSize = Math.max(col,row);
        int[][] answer = new int[arrSize][arrSize];
         
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                answer[i][j]=arr[i][j];
            }
        }
        
        for(int i=0; i<row; i++){
             for(int j=col; j<arrSize; j++){
                    answer[i][j] =0;
            }
        }
         
        for(int i=row; i<arrSize; i++){
            for(int j=0; j<arrSize; j++){
             answer[i][j]=0;
            }
        }
         
         return answer;
    }
}