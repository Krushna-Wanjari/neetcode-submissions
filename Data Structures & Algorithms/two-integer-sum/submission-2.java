class Solution {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++){
          int val = target - nums[i];

          for(int j = i +1 ; j < nums.length ; j ++){
          
            set.add(nums[j]);
            if(set.contains(val)) return new int[]{i , j};
          } 

          set.clear();
        }

        return new int[]{};
    }
}
