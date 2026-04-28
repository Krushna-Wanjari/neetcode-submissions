class Solution {
  boolean[] visited ;
  List<List<Integer>> graph ;

    public int countComponents(int n, int[][] edges) {

     visited = new boolean[n] ;
     int compo = 0 ;
     graph = new ArrayList<>();

     for(int i = 0 ; i < n ; i++){
      graph.add(new ArrayList());
     }

     for(int[] a : edges){
      graph.get(a[0]).add(a[1]);
      graph.get(a[1]).add(a[0]);
     }

     for(int i = 0 ; i < n ; i ++){
       if(visited[i]) continue ;
       compo ++;
       dfs(i);
     }

     return compo;

    }
    public void dfs(int i){
        visited[i] = true;

        for(int x : graph.get(i)){
          if(!visited[x]) dfs(x);
        }
    }
}
