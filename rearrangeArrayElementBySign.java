class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p[]=new int[nums.length/2];
        int n[]=new int[nums.length/2];
        int pi=0,ni=0,idx1=0,idx2=1;
        for(int e :nums){
            if(e>0) p[pi++]=e;
            else n[ni++]=e;
        }
        for(int e : p){
            nums[idx1]=e;
            idx1+=2;
        }
        for(int e : n){
            nums[idx2]=e;
            idx2+=2;
        }
        return nums;

        
    }
}
