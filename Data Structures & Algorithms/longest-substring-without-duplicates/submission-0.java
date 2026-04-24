class Solution {
    public int lengthOfLongestSubstring(String s) {
      Set<Character> set = new HashSet<>();
      int len = 0;
      int idx = 0 ;

      for(int i = 0 ; i < s.length() ; i++){
        
        while(set.contains(s.charAt(i)) && idx < s.length() ){
           //len = Math.max(len , idx - i + 1);
           set.remove(s.charAt(idx));
           idx++; 
        }
        set.add(s.charAt(i));

        len = Math.max(len , i - idx + 1);
      }  

      return len;
    }
}
