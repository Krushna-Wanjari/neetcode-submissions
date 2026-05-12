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
    public boolean canAttendMeetings(List<Interval> intervals) {
      List<int[]> list = new ArrayList<>();
      for(Interval x : intervals){
        list.add(new int[] { x.start , x.end});
      }

      Collections.sort(list , (a,b) -> Integer.compare(a[0] , b[0]));
      int allot = 0;

      for(int[] x : list){
        if(allot > x[0] ) return false;
        allot = x[1];
      }

      return true;
    }
}
