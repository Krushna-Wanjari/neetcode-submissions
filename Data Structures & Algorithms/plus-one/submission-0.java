class Solution {
    List<Integer> list = new ArrayList<>();

    public int[] plusOne(int[] nums) {
      
      check(nums.length -1 , nums);
      int[] out = new int[list.size()];
      for(int i = 0 ; i < out.length ; i ++ ){
        out[i] = list.get(list.size() - 1 - i);
      }
      return out ;
    }

    public void check(int idx , int[] nums ){
      if(nums[idx] != 9){
        list.add(nums[idx] + 1);
        for(int i = idx -1 ; i >= 0 ; i--){
            list.add(nums[i]);
        }
        return;
      }else{
        list.add(0);
        if(idx == 0){
            list.add(1);
            return;
        }
        check(idx - 1 , nums);
      }
      return;
    }
}
