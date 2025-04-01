package day3;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string to compress");
		String str = sc.next();
		
		System.out.println("Result: "+ compressString(str));
	}

	public static String compressString(String str) {
		
		String compressed ="";
		int count=1;
		
		// Iterate over the string and check each character and increase the count
		
		for(int i=0; i<str.length();i++) {
			
			if(i + 1 < str.length() && str.charAt(i) == str.charAt(i+1)) {
				count++;
			} else {

				compressed += str.charAt(i)+String.valueOf(count);
				count=1;
			}
		}
		
		return compressed.length() < str.length() ? compressed : str;
	}
}
