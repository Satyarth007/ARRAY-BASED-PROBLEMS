class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n<=2) return n;
        int max = nums[0], min = nums[0],maxi=0,mini=0;
        for(int i=1;i<n;i++){
            if(max >= nums[i]){
                max = nums[i];
                maxi = i;
            }
            if(min<= nums[i]){
                min=nums[i];
                mini = i;
            }
        }
        
// case :- from start the answer is max index between maxi and mini plus 1
        int startIdx = Math.max(maxi,mini); // largest index 
        int startAns = startIdx+1;

        // case :- fom end 
        int endIdx = Math.min(maxi,mini); // smallest index
        int endAns = n - endIdx;

        //case :- from both ends
        int bothAns = (endIdx+1) + (n- startIdx);

// final answer is the minimum among the cases
        int finalAns = Math.min(bothAns, Math.min(startAns,endAns));

        return finalAns;



    }
}
