import java.util.ArrayList;

public class subarrayWithGcdK {
	public static int getSub(int[] arr, int k) {
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++) {
        	int g=arr[i];
        	for(int j=i;j<n;j++) {
        		g=gcd(g,arr[j]);
        		if(g==k) count++;
        		if(g<k) break;
        		
        	}
        }
        
		return count;
        
    }
	public static int gcd(int a , int b) {
		if(a%b==0) {
			return b;
		}
		return gcd(b,a%b);
	}

	public static void main(String[] args) {
		// subarrays with gcd k
		int arr[]= {9,3,1,2,6,3};
		int k=3;
		int ans=getSub(arr,k);
		System.out.println(ans);

	}

}
