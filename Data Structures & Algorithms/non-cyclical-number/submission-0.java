class Solution {
    public boolean isHappy(int n) {
        String s = String.valueOf(n);
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        while(sum != 1){
          sum = 0;
          if(set.contains(Integer.parseInt(s))) return false;
          set.add(Integer.parseInt(s));
          for(char x : s.toCharArray()){
            sum = sum +((x-'0')*(x-'0'));
          }
          s = String.valueOf(sum);
        }
        return true;
    }
}
