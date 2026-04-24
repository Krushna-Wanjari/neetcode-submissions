class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder sb = new StringBuilder();

       for(char x : s.toCharArray()){

        if(Character.isDigit(x)){
          sb.append(x);
          continue;
        }
        if(x<='z' && x>='a'){
          sb.append(x);
          continue;
        }
        if(x<= 'Z' && x>= 'A'){
          sb.append(Character.toLowerCase(x));
          continue;
        }
       }

       String x = sb.toString();
       String z = sb.reverse().toString();

       return x.equals(z);

    }
}
