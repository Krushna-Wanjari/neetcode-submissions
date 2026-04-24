class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();

      for(int i = 0 ; i < nums.length ; i++){
        Set<Integer> set = new HashSet<>();

        for(int j = i +1 ; j < nums.length ; j++){
            if(set.contains(0 - (nums[i] + nums[j]))){
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(0 - (nums[i] + nums[j]));
                list.add(nums[j]);
                Collections.sort(list);

                if(!result.contains(list))result.add(list);
            }
            set.add(nums[j]);
        }
      }  

      return result ;
    }
}
