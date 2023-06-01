/* class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans = 0,idx=0;
        for(int i = cost.length-1;i>=0;i--){
            if(idx++!=2) ans+=cost[i];
            else idx=0;
        }
        return ans;

    }
} */
 // ANOTHER EXPLAINED SOLUTION 

class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;

        if(n==1) return cost[0];
        if(n==2) return cost[0]+cost[1];

        Arrays.sort(cost);

        int ans = 0;

// if  n is divisible by 3 , we get pairs of three
        if(n % 3 == 0){
         for(int i = n-1;i>=0;i--) if(i%3 !=0 ) ans+= cost[i];
        }
// otherwise there will be 1 or 2 candies left         
        else{
            if(n % 3 == 2){
                int idx=1;
                for(int i = n-1;i>=2;i--){
                    if(idx %3 !=0) ans+= cost[i];
                    idx++;
                }
                ans+= cost[1]+cost[0]; // bcz 2 candies left
            }

            if(n %3 ==1){
                int idx=1;
                for(int i = n-1;i>=1;i--){
                    if(idx %3 !=0) ans+= cost[i];
                    idx++;
                }
                ans+= cost[0]; // bcz 1 candy is left
            }
            
        }

        return ans;

    }
}
