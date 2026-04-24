class Solution {
    public int longestConsecutive(int[] nums) {
       Map<Integer , Integer> map = new HashMap<>();
       for(int x : nums){
        map.put(x , map.getOrDefault(x , 0) + 1);
       } 
       int out = 0;

       for(int i = 0 ; i < nums.length ; i++){

        int len = 1;
        int x = nums[i];

        while(map.keySet().contains(x+ 1)){
         len++;
         x++;
        }

        out = Math.max(out , len) ;
       }

       return out ;
    }
}
