class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack();

       for(char c : s.toCharArray()){
        
        if((c== ')' || c == ']' || c == '}') && stack.isEmpty()) return false;

        if(c == '(' || c == '{' || c == '['){
            stack.push(c);

        }else if(c == ')' && stack.peek()== '('){
            stack.pop();
            continue;

        }else if(c == '}' && stack.peek()== '{'){
            stack.pop();
            continue;

        }else if(c == ']' && stack.peek()== '['){
            stack.pop();
            continue;
        }else stack.push(c);
       }

       return stack.isEmpty(); 
    }
}
