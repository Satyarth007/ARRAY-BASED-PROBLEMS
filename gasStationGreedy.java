class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int g=0;
        int c=0;
        for(int e:gas) g+=e;
        for(int e:cost) c+=e;

        if(g<c) return -1;
        int cur=0,ans=0;
        for(int i=0;i<gas.length;i++){
            cur+= (gas[i]-cost[i]);
            if(cur<0){
                cur=0;
                ans=i+1;
            }
        }
        return ans;
    }
}
