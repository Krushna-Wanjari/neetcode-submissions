class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer , Integer> map = new HashMap<>() ;

      for(int x : nums){
        map.put( x , map.getOrDefault( x , 0 ) + 1);
      }   

      int[][] ary = new int[map.keySet().size()][2];
      int idx = 0;
      for(int x : map.keySet()){
         ary[idx][0] = x ;
         ary[idx][1] = map.get(x);
         idx++ ; 
      }
      idx = 0;
      int[] out = new int[k];

      Arrays.sort(ary , (a , b ) -> Integer.compare(b[1] , a[1]));
      while(k > 0){
       out[idx] = ary[idx][0] ;
       idx++;
       k--;
      }

      return out ;
    }
}
