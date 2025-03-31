package day2;

import java.util.Scanner;

public class RotateArray {

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
		
		System.out.println("Position to rotate");
		int k=sc.nextInt();
		
		rotateArray(arr, k, n);
	}
	
	public static void rotateArray(int[] arr,int k,int n) {
		
		// K value larger than the size of the array
		
			k=k%n;
		
			//Reverse first K position elements
			
			reverse(arr,0,k-1);
			
			// Reverse the remaining elements from index k
			
			reverse(arr,k,n-1);
			
			// Reverse the whole array
			
			reverse(arr,0,n-1);
			
			for(int i=0;i<n;i++) {
				
				System.out.print(arr[i]+" ");
			}
	}

	private static void reverse(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		
		while(start<end) {
			
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}

}
