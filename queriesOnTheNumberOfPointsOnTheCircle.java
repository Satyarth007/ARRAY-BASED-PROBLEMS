class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int ans[]=new int[queries.length];
        int idx=0;
        for(int[] q: queries){
            int x=q[0], y= q[1], r=q[2];
            int count=0;
            for(int[] p:points){
                int a=p[0],b=p[1];
                int eq= (int)Math.pow(a-x,2)+ (int)Math.pow(b-y,2) - (int)Math.pow(r,2);
                if(eq<=0) count++; 

            }
            ans[idx++]=count;
        }
        return ans;
        
    }
}
