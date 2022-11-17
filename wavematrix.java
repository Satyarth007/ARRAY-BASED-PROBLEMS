
// WAVE FORM OF A 2-D MATRIX .
// CODE BY SATYARTH

import java.util.Scanner;
public class wavematrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of rows :- ");
		int r=sc.nextInt();
		System.out.print("Enter the number of columns :- ");
		int c=sc.nextInt();
		
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("MATRIX BEFORE :- ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("MATRIX AFTER :- ");
		
		for(int i=0;i<c;i++) {
			if( i % 2 == 0) {
				for(int j=0;j<r;j++) {
					System.out.print(arr[j][i]+" -> ");
				}
			}else {
				for(int j=r-1;j>=0;j--) {
					System.out.print(arr[j][i]+" -> ");
				}
			}
			
			
		}
		
		

	}

}
