class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      String[] ary = new String[strs.length];
      for(int i = 0 ; i < strs.length ; i++){
        String x = strs[i] ;
        char c[] = x.toCharArray();
        Arrays.sort(c);

        ary[i] = new String(c) ;
      }

      boolean visited[] = new boolean[strs.length];
      ArrayList<List<String>> result = new ArrayList<>();

      for(int i = 0 ; i < strs.length ; i++){
        if(visited[i]) continue;
        visited[i] = true;

        List<String> list = new ArrayList<>();
        list.add(strs[i]);

        for(int j = i +1 ; j < strs.length ; j++) {
          if(visited[j]) continue;

          if(ary[i].equals(ary[j])){
            list.add(strs[j]) ; 
            visited[j] = true ;
          }
        }

        result.add(list);
      }

      return result ;
    }
}
