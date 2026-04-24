class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int m = nums.length ;
        int n = nums[0].length ;
        if(target < nums[0][0] || target > nums[m-1][n-1]) return false;

        for(int i = 0 ; i  < m ; i ++){
            if(target >= nums[i][0] && target <= nums[i][n -1]){
              int left = 0;
              int right = n-1;

              while(left <= right){
                int mid = left + (right - left) / 2;
                if(nums[i][mid] == target) return true;
                if(nums[i][mid] > target)right = mid - 1 ;
                else left = mid + 1 ;
              }
              return false;
            }
        }
        return false;

    }
}
