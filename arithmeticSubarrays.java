import java.util.*;

public class arithmeticSubarrays {
	public static List<Boolean> check(int[] nums, int[] l, int[] r) {
        List<Boolean> al=new ArrayList<>();
        for(int i=0;i<l.length;i++) {
        	if(ans(nums,l[i],r[i])) al.add(true);
        	else al.add(false);
        }
        return al;
        
    }
	public static boolean ans(int[] nums,int a,int b) {
		int arr[]=Arrays.copyOfRange(nums, a, b+1);
		
		Arrays.sort(arr);
		if(arr.length<2) return false;
		// code to see the subaarays 
		for(int x:arr) System.out.print(x+" ");
		System.out.println();
		
		int diff=Math.abs(arr[1]-arr[0]);
		for(int i=0;i<arr.length-1;i++) {
			if(Math.abs(arr[i]-arr[i+1])!=diff) return false;
			
		}
	    return true;
	}

	public static void main(String[] args) {
		int nums[]= {-3,-6,-8,-4,-2,-8,-6,0,0,0,0};
		int l[]= {5,4,3,2,4,7,6,1,7};
		int r[]= {6,5,6,3,7,10,7,4,10};
		System.out.println(check(nums,l,r));
		//[true,true,true,true,false,true,true,true,true]
	}

}
