class Solution {
    int m ;
    int n ;

    public void setZeroes(int[][] matrix) {
       Queue<int[]> record = new LinkedList<>() ;
       m = matrix.length;
       n = matrix[0].length;

       for(int i = 0 ; i < m ; i++){
        for(int j = 0 ; j < n ; j++){
          if(matrix[i][j] == 0){
            record.add(new int[]{i , j});
          }
        }
       }

       while(!record.isEmpty()){
        int a[] = record.poll();
        convert(a[0] , a[1] , matrix);
       }

    }

    public void convert( int r , int l , int[][] matrix){
        for(int i = 0 ; i < n ; i ++ ){
            matrix[r][i] = 0;
        }
        for(int i = 0 ; i < m ; i ++ ){
            matrix[i][l] = 0;
        }
    }
}
