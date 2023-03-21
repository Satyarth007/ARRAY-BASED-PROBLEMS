import java.util.regex.*;
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0,c=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) ans++;
            
            if(i>0 && nums[i]==0 && nums[i-1]==0) c++;
            else{
                ans+=((c*(c+1)/2)-c);
                c=1;
            }
            if(i==nums.length-1){
                ans+=((c*(c+1)/2)-c);
                c=1;
            }

        }
        return ans;
    }
}
