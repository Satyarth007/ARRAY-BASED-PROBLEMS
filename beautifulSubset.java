class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < (1 << n); i++) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if ((i & (1 << j)) != 0) {
                temp.add(nums[j]);
            }
        }
        al.add(temp);
        } 
        int count=0;
        for(int i =0;i<al.size();i++){
            if(al.get(i).size()==0) continue;
            if(al.get(i).size()==1) count++;
            else{
                //Collections.sort(al.get(i));
                ArrayList<Integer> h = new ArrayList<>(al.get(i));
               // Collections.sort(h);
                boolean flag=true;
                for(int j=0;j<al.get(i).size()-1;j++){
                    for(int p =j+1 ;p<h.size();p++){
                        int a = h.get(j);
                        int b = h.get(p);
                        if(Math.abs(a-b)==k){
                         flag = false;
                         break;
                        }
                            
                        
                    }
                    
              }
                if(flag) count++;
            } 
            
        }
        return count;
        
        
    }
}
