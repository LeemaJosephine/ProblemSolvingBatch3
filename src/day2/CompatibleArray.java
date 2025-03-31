package day2;

import java.util.Scanner;

public class CompatibleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size of the 1st array");
		int n=sc.nextInt();
		
		System.out.println("Enter the elements of the 1st array");
		
		int[] arr1=new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Size of the 2nd array");
		int m=sc.nextInt();
		
		System.out.println("Enter the elements of the 2st array");
		
		int[] arr2=new int[m];
		
		for(int i=0;i<n;i++) {
			
			arr2[i]=sc.nextInt();
		}
		
		if(checkCompatibility(arr1, arr2, n, m)) {
			
			System.out.println("Arrays are compatible");
		} else {
			
			System.out.println("Not compatible");
		}
	}
	
	public static boolean checkCompatibility(int[] arr1, int[] arr2, int n, int m) {
		
		// Check the length of both the array
		
		if(n!=m) {
			
			return false;
		}
		
		for(int i=0;i<n;i++) {
			
			if(arr1[i]<arr2[i]) {
				
				return false;
			}
		}
		
		return true;
	}

}
