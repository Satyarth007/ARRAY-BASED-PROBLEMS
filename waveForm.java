import java.util.*;
public class waveForm {
	public static void waveform(int []arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8, 1, 2, 3, 4, 5, 6, 4, 2}; 
		waveform(arr);
		for(int e:arr) {
			System.out.print(e+" " );  //2 2 3 4 4 5 6 8 1 
		}
	}

}
