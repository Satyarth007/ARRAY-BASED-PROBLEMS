class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int e:accounts[i]) sum+=e;
            if(max<=sum) max=sum;
        }
        return max;
    }
}
