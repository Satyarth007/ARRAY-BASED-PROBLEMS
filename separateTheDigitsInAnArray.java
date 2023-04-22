class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        int idx=0;
        for(int e:nums){
            if(e<10) al.add(idx++,e);
            else{
                while(e!=0){
                    al.add(idx,e%10);
                    e = e/10;

                }
                idx = al.size();
            }
        }
        int ans[]=new int[al.size()];
        int i =0;
        for(Integer e:al) ans[i++]=e;
        return ans;
    }
}
