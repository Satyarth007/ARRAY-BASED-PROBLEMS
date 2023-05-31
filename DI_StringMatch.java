class Solution {
    public int[] diStringMatch(String s) {
        int ans[]= new int[s.length()+1];
        int idx=0;
        int i = 0, d = s.length();

        for(char e: s.toCharArray()){
            if(e=='I') ans[idx++] = i++;
            else ans[idx++] = d--;
        }
        ans[idx]=i;

        return ans;
        
    }
}
