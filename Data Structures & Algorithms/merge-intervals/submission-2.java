class Solution {
    public int[][] merge(int[][] intervals) {
       List<int[]> list = new ArrayList<>();
       for(int[] x : intervals){
        list.add(x);
       }
       Collections.sort(list , (a,b) -> Integer.compare(a[0] , b[0]));

       for(int i = 1 ; i < list.size() ; i++ ){
        int[] a = list.get(i-1);
        int[] b = list.get(i);

        if(a[1] >= b[0]){
            list.set(i , new int[]{a[0] , Math.max(a[1] , b[1])});
            list.set(i-1 , new int[]{-1,-1});
        }

       }

       List<int[]> bo = new ArrayList<>();
       for(int[] x : list){
        if(x[0] == -1) continue;
        bo.add(x);
       }

       int[][] out = new int[bo.size()][2];
       for(int i = 0 ; i < bo.size() ; i++ ){
        out[i] = bo.get(i);
       }

       return out ;
    }
}
