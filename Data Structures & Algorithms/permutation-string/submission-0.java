class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int left= 0 ;
       int right = s1.length() ;
       s1 = sort(s1);

       for(int i = right ; i <= s2.length( ) ; i++){
         String x = s2.substring(left , i);
         x = sort(x);

         if(x.equals(s1)) return true;
         left++;
       }
       return false;
    }

    public String sort(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        return new String(ch);

    }
}
