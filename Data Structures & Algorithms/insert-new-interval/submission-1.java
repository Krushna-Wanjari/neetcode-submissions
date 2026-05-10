class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

      List<int[]> list = new ArrayList<>();
      list.add(newInterval);
      for(int[] x : intervals){
        list.add(x);
      }

      Collections.sort(list , (a,b) -> a[0] - b[0]);

      for(int i = 1 ; i < list.size() ; i++ ){
        int[] a = list.get(i-1);
        int[] b = list.get(i);

        if(a[1] >= b[0]){
            list.set(i , new int[]{a[0] , Math.max(a[1] , b[1])});
            list.set(i-1 , new int[]{-1,-1});
        }
      }

      List<int[]> listi = new ArrayList<>();
      for(int[] x : list){
        if(x[0] != -1)listi.add(x);
      }
      int[][] out = new int[listi.size()][2];
      for(int i = 0 ; i < listi.size() ; i ++){
        out[i] = listi.get(i);
      }

      return out ;
    }
}
