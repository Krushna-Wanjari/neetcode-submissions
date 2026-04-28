class Solution {
  Map<Integer , List<Integer>> graph;

    public int[] findRedundantConnection(int[][] edges) {
     int n = edges.length; //no. of edges
     graph = new HashMap<>();

     for(int a[] : edges){
      graph.putIfAbsent(a[0] , new ArrayList<>());
      graph.putIfAbsent(a[1] , new ArrayList<>());

      graph.get(a[0]).add(a[1]);
      graph.get(a[1]).add(a[0]);
     }

     for(int i = n-1 ; i >= 0 ; i-- ){
      int[] x = edges[i];

      //remove edge from graph:
      graph.get(x[0]).remove(Integer.valueOf(x[1]));
      graph.get(x[1]).remove(Integer.valueOf(x[0]));

      //check is graph still connected or no:
      if(connect(x[0] , new HashSet<>()) == n) return x;  //if graph is still connected 

      //not connected:
      graph.get(x[0]).add(x[1]);
      graph.get(x[1]).add(x[0]);

     }

     return new int[]{};
    }

    public int connect(int root , Set<Integer> set ){
      set.add(root);
      int count = 1 ;

      for(int x : graph.get(root)){
        if(!set.contains(x)) count += connect( x , set );
      }
      return count;
    }
}
