class Solution {
    public int maxSubArray(int[] nums) {
       // int[] dp = new int[nums.length + 1] ;
       int sum = nums[0];
       
       for(int i = 0 ; i < nums.length ; i++){
         int z = 0;
        for(int j = i ; j < nums.length ; j++){
            z += nums[j];
            sum = Math.max(sum , z );
        }
       }
       return sum ;


    }
}
