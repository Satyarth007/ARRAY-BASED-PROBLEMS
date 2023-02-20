class Solution {
    public int totalMoney(int n) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(0,1);
        int idx=1;
        for(int i=1;i<n;i++){
            if(i%7==0){
                al.add(i,++idx);
            }else{
                al.add(i,al.get(i-1)+1);
            }
        }
        int sum=0;
        for(Integer e:al) sum+=e;
        return sum;
        
    }
}
