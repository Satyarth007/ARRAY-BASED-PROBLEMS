class Solution {
    public static boolean helper(int[] arr,int val){
        int count=0;
        for(int ele:arr){
            if(ele==val) count++;
        }
        
        return count > arr.length/3;
    }
    
    public List<Integer> majorityElement(int[] arr) {
        int val1=arr[0];
        int count1=1;
        int val2=arr[0];
        int count2=0;
        
        int i=1;
        while(i < arr.length){
            if(arr[i]==val1){
                count1++;
            }else if(arr[i]==val2){
                count2++;
                
            }else{
                if(count1==0){
                    
                    val1=arr[i];
                    count1=1;
                }else if(count2==0){
                    val2=arr[i];
                    count2=1;
                }else{
                    count1--;
                    count2--;
                }
            }
            i++;
        }
        ArrayList<Integer> al=new ArrayList<>();
        if(helper(arr,val1)) al.add(val1);
        if(val1 != val2 && helper(arr,val2)) al.add(val2);
        
        return al;
    }
    
}
