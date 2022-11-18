class Solution {
  // Approach 1 - we can use brute force - O(n^2)
  //Approach 2 - we can use division operator - O(N)
  // Approach 3 - or we can use this prefix product concept
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        // left prefix product
        int l=1;
        for(int i=0;i<nums.length;i++){
            arr[i]=l;
            l = l*nums[i];
                
        }
        // right prefix product
        int r=1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]*=r;
            r = r*nums[i];
                
        }
        
        return arr;
        
        
    }
}
