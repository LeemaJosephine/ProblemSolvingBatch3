package day2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements of the array");
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element you want to search");
		int  target =sc.nextInt();
		
		// To sort the array
		Arrays.sort(arr);
	
		// Call the method for searching 
		int index = binarySearch(arr, target);
		
		if(index==-1) {
			
			System.out.println("Element not found");
		} else {
			
			System.out.println("Element found at the index: " + index);
		}
		
		
	}
	
	public static int binarySearch(int[] arr, int target) {
		
		
		int left =0;
		int right = arr.length-1;
		
		while(left<=right) {
			
			int mid = (left + right)/2;
			
			// check target element matches with mid element
			
			if(arr[mid]==target) {
				 return mid;
			}
			
			if(arr[mid]<target) {
				
				left = mid +1;
			} else {
				
				right = mid -1;
			}
		}
		
		return -1;
	}

}


// Time Complexity : O(n)
