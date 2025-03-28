package day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(checkPrime(num)) {
			
			System.out.println("Prime number");

		} else {
			
			System.out.println("Not a prime");
		}
	}

	public static boolean checkPrime(int num) {
		
		if(num<=1) {
			
			return false;
			
		}
		
		for(int i=2; i<=Math.sqrt(num);i++) {  // 
		
			if(num % i == 0){ // if its divisible its not a prime
				
				return false;
			}
		}
		
		return true;
		
	}
}

// Time Complexity : O(squrt(n))

