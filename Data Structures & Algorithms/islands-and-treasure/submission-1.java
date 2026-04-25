class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        // Step 1: push all gates
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};

        // Step 2: BFS
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            for (int[] d : dir) {
                int r = curr[0] + d[0];
                int c = curr[1] + d[1];

                if (r >= 0 && c >= 0 && r < m && c < n 
                    && grid[r][c] == Integer.MAX_VALUE) {

                    grid[r][c] = grid[curr[0]][curr[1]] + 1;
                    queue.add(new int[]{r, c});
                }
            }
        }
    }
}