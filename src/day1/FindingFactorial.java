package day1;

import java.util.Scanner;

public class FindingFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		long result = factorial(num);
		System.out.println(result);
	}
	
	public static long factorial(int n) {
		long fact=1;
		if(n == 0 || n == 1) {
			return 1;
		} else {
			for(int i=1;i<=n;i++) {
				
				fact=fact*i;
			}
		}
		return fact;
	}

}

// Time Complexity: O(n!)

