import java.util.ArrayList;

public class subarray {

	public static void main(String[] args) {
		// GENERATING AND STORING SUBARRAYS OF AN ARRAY 
		// code by : satyarth
		ArrayList<ArrayList<Integer>> al=new ArrayList<>();
		int arr[]= {1,2,3,4};
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i;j<arr.length;j++) {
				ArrayList<Integer> a=new ArrayList<>();
				for(int k=i,l=0;k<=j&&l<arr.length;k++,l++) {
					a.add(l,arr[k]);
				}
				al.add(j,a);
				
			}
			
		}
		System.out.println(al);
		// [[1], [2], [3], [4], [3, 4], [2, 3], [2, 3, 4], [1, 2], [1, 2, 3], [1, 2, 3, 4]]

	}

}
