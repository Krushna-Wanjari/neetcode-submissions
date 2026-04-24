class Solution {
    public int maxArea(int[] heights) {

      int store = 0;

      for(int i = 0 ; i < heights.length ; i++){
        int area = 0;
        for(int j = i + 1 ; j < heights.length ; j++){
          area = Math.max(Math.min(heights[i] , heights[j]) * (j - i) , area);
        }

        store = Math.max(area ,store);
      }  

      return store ;
    }
}
