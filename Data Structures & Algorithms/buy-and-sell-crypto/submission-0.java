class Solution {
    public int maxProfit(int[] prices) {
       Stack<Integer> stack = new Stack();
       int profit = 0;

       for(int i = 0 ; i < prices.length ; i ++){
        if(stack.isEmpty()){
          stack.push(prices[i]);
          continue;
        } 

        if(stack.peek() > prices[i]){
            stack.push(prices[i]);
        }else{
            profit = Math.max(profit , prices[i] - stack.peek());
        }

       } 
       return profit ;
    }
}
