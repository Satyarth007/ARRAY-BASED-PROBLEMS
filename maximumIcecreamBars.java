class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        for(int e:costs){
            if(e<=coins){
                count++;
                coins-=e;
            }
        }
        return count;
    }
}
