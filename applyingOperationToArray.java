class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=2*nums[i];
                nums[i+1]=0;
                
            } 
        }
        // now moving all zeroes to right      | we can use snow ball technique to solve further 
        int zi = n - 1;
        int i = 0;

        while(i < zi) {
            if(nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[zi];
                nums[zi] = temp;
                zi--;        
                continue;
            }
            i++;
        }
        return nums;
        
    }
}
