package day2;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size of the array");
		int n=sc.nextInt();
		
		System.out.println("Enter the elements of the array");
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		//Sort the array before removing the duplicates
		Arrays.sort(arr);
		
		// Calling the method to remove the duplicates
		int newLength = removeDuplicates(arr, n);
		
		System.out.println("Duplicates Removed!!!");
		for(int i=0; i<newLength;i++) {
			
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int removeDuplicates(int[] arr,int n) {
		
		if(n==0||n==1) {
			return n; // no duplicates
		}
		
		int j=0;
		for(int i=0;i<n-1;i++) {
			
			if(arr[i]!=arr[i+1]) { // 1 2 3 4
				
				arr[j++] = arr[i];
			}
		}
		
		arr[j++]=arr[n-1];
		return j;
	}

}
