package day3;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// Get first string
		
		String str1 = sc.next();
		
		// Get second sring
		
		String str2 = sc.next();
		
		if(checkAanagram(str1, str2)) {
			
			System.out.println("Strings are anagram");
		} else {
			System.out.println("Not anagram");
		}
		
	}
	
	public static boolean checkAanagram(String str1, String str2) {
		
		// Check for the string length
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		//Convert the Strings to arrays.
		char[] charArray = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		// Sort the array
		
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		
		// Compare
		
		return Arrays.equals(charArray, charArray2);
	}

}
