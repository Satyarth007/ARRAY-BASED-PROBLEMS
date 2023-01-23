class Solution {
    public int alternateDigitSum(int n) {
        int p=((int)Math.log10(n))+1;
        int flag=0;
        if(p%2==0) flag=-1;
        else flag=1;
        int sum=0;
        while(n!=0){
            sum = sum+ (n%10)*flag;
            n=n/10;
            if(flag==1) flag=-1;
            else flag=1;
            

        }
        return sum;
        
        
        
    }
}
