/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    List<Integer> set = new ArrayList<>();

    public int minMeetingRooms(List<Interval> intervals) {
      List<int[]> list = new ArrayList<>();
      for(Interval x : intervals){
        list.add(new int[]{x.start , x.end});
      }

      Collections.sort(list , (a,b) -> Integer.compare(a[0] , b[0]));

      for(int i = 0 ; i < list.size() ; i ++ ){
        int[] a = list.get(i);
        check(a[0] , a[1]);
      }
      return set.size();
    }

    public void check(int x , int z){
        if(set.isEmpty()){
             set.add(z);
             return ;
        } 
        
        for(int w : set){
            if(w <= x){
                set.remove(Integer.valueOf(w));
                set.add(z);
                return ;
            }
        }

        set.add(z);
        return ;

    }
}
