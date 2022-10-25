
public class MOORES_VOTING_ALGORITHM {
	public static int valueCandidate(int []arr) {
		int val=arr[0];
		int count=1;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==val) count++;
			else count--;
			
			if(count==0) {
				val=arr[i];
				count=1;
			}
		}
		return val;
	}
	public static void printMajorityElement(int []arr) {
		int value= valueCandidate(arr);
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) count++;
		}
		
		if(count > arr.length/2)
			System.out.println("MAJORITY ELEMENT IS :- "+value);
		else
			System.out.println("NO MAJORITY ELEMENT");
	}

	public static void main(String[] args) {
		int arr[]= {1,2,1,3,1,4,1};
		
		printMajorityElement(arr);

	}

}
