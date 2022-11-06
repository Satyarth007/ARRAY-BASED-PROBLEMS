
public class prefixSum {

	public static void main(String[] args) {
		// PREFIX SUM PROBLEM
		int arr[]= {1,4,2,5,3};
		
		int pSum[]=new int[arr.length];
		
		pSum[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			pSum[i]= pSum[i-1]+arr[i];
		}
		
		for(int i=0;i<pSum.length;i++) {
			System.out.print(pSum[i]+"  ");
		}

	}

}
