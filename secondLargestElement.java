
public class secondLargestElement {
	// first approach :- sort the array (ascending) and return the second last element .
	// second approach :- two for loops approach , first to calc largest and the other to get the second 
	// third approach :- single for loop
	public static int secLar(int []arr) {
		int s,f;
		s=f=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>f) { // if arr[i] is greater than first 
				
				s=f;		//then initially make second largest = largest
				
				f=arr[i];	// make largest arr[i]
			}
			
			else if(arr[i]>s && arr[i]!=f) {
				s=arr[i];
			}
			
		}
		
		return s;
	}

	public static void main(String[] args) {
		// satyarth
		int arr[]= {12,63,41,20,18,36,79,100};
		
		int ans=secLar(arr);
		System.out.println(ans);

	}

}
