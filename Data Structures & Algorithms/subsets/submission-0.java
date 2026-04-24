class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
      List<Integer> list = new ArrayList<>() ;
      backtrack(0 , list , nums);
      return result;

    }

    public void backtrack(int idx , List<Integer> list , int[] nums){
      if(idx == nums.length){
        result.add(new ArrayList<>(list));
        return;
      }

      list.add(nums[idx]);
      backtrack(idx+1 , list , nums);
      list.remove(list.size() - 1);
      backtrack(idx + 1 , list , nums);
    }
}
