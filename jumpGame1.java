class Solution {
    public boolean canJump(int[] nums) {
        int ans=nums.length-1;
        for(int i = nums.length-1;i>=0;i--){
            if(i+nums[i]>=ans){
                ans=i;
            }
        }
        return ans==0;
        
    }
}
