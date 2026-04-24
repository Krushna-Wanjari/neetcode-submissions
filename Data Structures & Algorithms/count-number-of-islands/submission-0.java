class Solution {
    boolean[][] visited;
    int m ;
    int n ;

    public int numIslands(char[][] grid) {
       m = grid.length;
       n = grid[0].length;
       visited = new boolean[m][n];
       int count = 0 ;

       for(int i = 0 ; i < m ; i++){
        for(int j = 0 ; j < n ; j++){

            if(grid[i][j] == '0' || visited[i][j]) continue;
            count ++;
            dfs(grid , i , j);
        }
       }
       return count ;

    }

    public void dfs(char[][] grid , int i , int j){
       if(visited[i][j]) return;
       visited[i][j] = true;
       if(i+1 < m && grid[i+1][j] == '1' ) dfs(grid , i+1 , j);
       if(j+1 < n && grid[i][j+1] == '1' ) dfs(grid , i , j+1);
       if(i-1 >= 0 && grid[i-1][j] == '1') dfs(grid , i-1 , j);
       if(j-1 >= 0 && grid[i][j-1] == '1') dfs(grid , i , j-1);
    }
}
