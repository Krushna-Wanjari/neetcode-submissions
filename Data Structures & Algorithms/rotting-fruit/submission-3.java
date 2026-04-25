class Solution {
    public int orangesRotting(int[][] grid) {
       int m = grid.length;
       int n = grid[0].length ;

        Queue<int[]> queue = new LinkedList<>() ;
        int total = 0 ;

        for(int i = 0 ; i < m ; i ++){
             for(int j = 0 ; j < n ; j++){
                 if(grid[i][j] == 0) continue;
                 total ++;
                 if(grid[i][j] == 2)queue.add(new int[]{i , j});
             }
        }
        
        int time = -1;
        int count = 0;

        while(!queue.isEmpty()){
          time ++;

          int siz = queue.size();
          count += siz ;

          for(int i = 0 ; i < siz ; i++){
            int[] a = queue.poll();
            int y = a[0];
            int z = a[1];


            int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
            for(int[] x : dir){
                int l = x[0];
                int r = x[1];

                if(y+l >= 0 && y+l < m && z+r >= 0 && z+r < n && grid[y+l][z+r] == 1){
                    queue.add(new int[]{y+l , z+r});
                     //rotten
                     grid[y+l][z+r] = 2 ;
                }
            }
          }

        }

        if(count == total && count ==0 ) return 0;
        if(count == total ) return time;
        return -1;
    }
}
