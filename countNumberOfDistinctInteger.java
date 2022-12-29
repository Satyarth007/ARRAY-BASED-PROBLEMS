import java.util.*;

public class demo {
	public static int rev(int n) {
		int r=0;
		while(n>0) {
			r=r*10 + (n%10);
			n=n/10;
		}
		return r;
	}

	public static void main(String[] args) {
		
		int nums[]= {1,13,10,12,31};
		 ArrayList<Integer> al=new ArrayList<>();
		 for(int x:nums) {
			 al.add(x);
			 
		 }
		 for(int x:nums) {
			 al.add(rev(x));
		 }
		 System.out.println(al);
		 HashSet<Integer> hs=new HashSet(al);
		 System.out.println(hs.size());
		 

	}

}
