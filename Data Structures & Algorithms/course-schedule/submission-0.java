class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0 ; i < numCourses ; i++){
            graph.add(new ArrayList<>());
        }

        for(int a[] : prerequisites){
            graph.get(a[0]).add(a[1]);
        }

        for(int i = 0 ; i < numCourses ; i++ ){
           Queue<Integer> queue = new LinkedList<>();
           queue.add(i);
           boolean visited[] = new boolean[numCourses];

           while(!queue.isEmpty()){
            int siz = queue.size();

            for(int j = 0 ; j < siz ; j++){
              int current = queue.poll();

              for(int w : graph.get(current)){
                if(w == i) return false ;
                if(!visited[w]){
                    queue.add(w);
                    visited[w] = true;
                }
              }

            }
           }
        }

        return true ;
    }
}
