
public class kadanesAlgorithm {

	public static void main(String[] args) {
		// optimal approach to find the subarray with maximum sum
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		int n = arr.length;
		int maxSum = Integer.MIN_VALUE;
		int sum=0;
		int start=0;
		int subStart=-1, subEnd=-1;
		for(int i =0;i<n;i++) {
			if(sum==0) start=i;
			
			sum+= arr[i];
			
			if(sum > maxSum) {
				subStart=start;
				subEnd = i;
				maxSum = sum;
			}
			if(sum<0) sum=0; // if the sum gets -ve we assign it to 0 
		}
		System.out.println("The max sum is : "+maxSum);
		for(int i = subStart;i<=subEnd;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
