class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

      HashMap<Integer ,Integer> map = new HashMap<>()  ;
      Set<Integer> set = new HashSet<>();

      for(int x : hand){
        map.put( x , map.getOrDefault( x , 0) + 1);
        set.add(x);
      }

      int grp = 0 ;
      while(!set.isEmpty()){
        int least = Collections.min(set);
        least--;

        for(int i = 0 ; i < groupSize ; i ++){
            least ++;
            if(!set.contains(least)) return false;
            map.put(least , map.get(least) - 1);

            //remove if no more left:
            if(map.get(least) == 0) set.remove(least);
        }
      }

      return true;
    }
}
