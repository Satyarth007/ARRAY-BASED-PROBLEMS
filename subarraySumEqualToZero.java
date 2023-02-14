
public class subarraySumEqualToZero {

	public static void main(String[] args) {
		int arr[]= {15,-2,2,-8,1,7,10,23};
		int maxlen=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				count++;
				if(sum==0) if(maxlen<=count) maxlen=count;
			}
		}
		System.out.println("ANSWER :- "+maxlen);

	}

}
