//SNOW BALL TECHNIQUE 
class Solution {
    public void moveZeroes(int[] nums) {
      // snow ball technique 
      int sbs = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                sbs++; 
            }
            else if (sbs > 0) {
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-sbs]=t;
            }
        }
        
    }
}
