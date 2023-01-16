class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        int idx1=0,idx2=n;
        for(int i=0;i<2*n-1;i+=2){
            ans[i]=nums[idx1];
            ans[i+1]=nums[idx2];
            idx1++;
            idx2++;
        }
        return ans;
    }
}     
