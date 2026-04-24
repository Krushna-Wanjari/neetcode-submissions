class Solution {
    public int findMin(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int x : nums){
            list.add(x);
        }
        return Collections.min(list);
    }
}
