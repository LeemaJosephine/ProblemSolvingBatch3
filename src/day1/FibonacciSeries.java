package day1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		fibonacci(num);
		
	}
	
	public static void fibonacci(int n) {
	
		int ft=0, st =1;
		int nx;
		
		for(int i=1;i<=n;i++) {
			
			System.out.print(ft+" ");
			
			// calculate the next element
			
			nx = ft + st;
			ft = st;
			st =nx;
		}
		
		
	}

}

//Time complexity: O(n)
