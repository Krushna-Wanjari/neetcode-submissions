class Solution {
    public List<Integer> partitionLabels(String s) {
       Map<Character,Integer> map = new HashMap<>() ;

       for(int i = 0 ; i < s.length() ; i++){
         map.put(s.charAt(i) , i);
       }
       List<Integer> list = new ArrayList<>();

       for(int i = 0 ; i < s.length() ; i++ ){
        int size = map.get(s.charAt(i));
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(i));

        for(int j = i+1 ; j <= size ; j ++ ){
          if(!set.contains(s.charAt(j))) {
            size = Math.max(size ,  map.get(s.charAt(j)));
            set.add(s.charAt(j));
          }
        }

        list.add(size - i + 1 );
        i = size ;
       }

       return list ;
    }
}
