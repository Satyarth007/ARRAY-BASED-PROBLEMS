// Below approach works fine but there is even better approach

class Solution {
    public boolean check(int[] nums) {
        int k = nums.length;
        //at max you can rotate the array nums.length times
        //below code rotates the array one by one
        for(int i = 0;i<k;i++){
            int temp = nums[nums.length-1];
            for(int j = nums.length-1;j>0;j--){
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
            //at every instance check whether the array is sorted or not
            if(isSorted(nums)){
                return true;
            }
        }
        //even if by rotating the array k(nums.length) times the array is not sorted, means return false 
        return false;
    }
    //function to check whether the array is sorted or not
    public boolean isSorted(int nums[]){
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
}
// Best Approach

class Solution {
    public boolean check(int[] nums) {
        int dp  = 0;
        int n = nums.length;
        for(int i =0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                dp++;
            }
        }
        if(dp==0){
            //given array is sorted
            return true;
        }
       else if(dp==1 && nums[0]>=nums[n-1] ){
            //given array is sorted and rotated
            return true;
        }
        return false;
    }
}
