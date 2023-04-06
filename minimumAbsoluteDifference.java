class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int x = arr[i+1]-arr[i];
            if(diff>=x) diff=x;
        }
        List<List<Integer>> al=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            List<Integer> temp=new ArrayList<>();
            int x = arr[i+1]-arr[i];
            if(diff==x){
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                al.add(temp);
            }
            
        }
        return al;
        
    }
}
