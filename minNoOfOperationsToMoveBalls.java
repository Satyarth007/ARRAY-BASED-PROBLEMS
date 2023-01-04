class Solution {
    public int[] minOperations(String boxes) {
        int arr[]=new int[boxes.length()];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i)=='1') al.add(i);
        }
        for(int i=0;i<boxes.length();i++){
            arr[i]=ans(al,i);
        }
        return arr;

    }
    public int ans(ArrayList<Integer> al,int idx){
        int sum=0;
        for(int i=0;i<al.size();i++){
            sum+=Math.abs(al.get(i)-idx);
        }
        return sum;

    }
}
