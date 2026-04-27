class Solution {
    boolean[][] data;
    int m ;
    int n ;

    public void solve(char[][] board) {
        m = board.length;
        n = board[0].length;

        data = new boolean[m][n];   

     //first row:
     for(int i = 0 ; i < n ; i ++){
        if(board[0][i] == 'O') dfs(0 , i , board);
     }

     //first col:
     for(int i = 0 ; i < m ; i ++){
        if(board[i][0] == 'O') dfs(i , 0 , board);
     }

     //last row:
     for(int i = 0 ; i < n ; i ++){
        if(board[m-1][i] == 'O') dfs(m-1 , i , board);
     }

     //last col:
     for(int i = 0 ; i < m ; i ++){
        if(board[i][n-1] == 'O') dfs(i , n-1 , board);
     }

     for(int i = 1 ; i < m-1 ; i ++){
        for(int j = 1 ; j < n-1 ; j ++){
            if(!data[i][j] && board[i][j] == 'O'){
                board[i][j] = 'X';
            }
        }
     }

     return ;
    }

    public void dfs(int i , int j , char[][] nums ){
      int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
      data[i][j] = true;

      for(int[] a : dir){
         int r = a[0];
         int l = a[1];

         if(i + r >= 0 && i+r < m && j+l >= 0 && j+l < n && nums[i+r][j+l] == 'O' && !data[i+r][j+l]){
            //data[i+r][j+l] = true ;
            dfs(i+r , j+l , nums);
         }
      }
    }
}
