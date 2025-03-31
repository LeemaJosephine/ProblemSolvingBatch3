package day2;

import java.util.HashSet;
import java.util.Scanner;

public class RepeatingElements {

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

		getRepeatedElements(arr);
	}

	public static void getRepeatedElements(int[] arr) {
		
		HashSet<Integer> obj1= new HashSet<Integer>(); //Keep the element as it is
		HashSet<Integer> obj2= new HashSet<Integer>(); //repeated element
		
		//traverse over the array
		for(int i=0;i<arr.length;i++) {
			if(obj1.contains(arr[i])) {
				obj2.add(arr[i]);
			} else {
				obj1.add(arr[i]);
			}
		}
		
		if(obj2.isEmpty()) {
			System.out.println("No repeated elements");
		} else {
			
			for(int repeated : obj2) {
				
				System.out.print(repeated+" ");
			}
		}
	}
}
