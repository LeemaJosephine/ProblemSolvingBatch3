package day3;

import java.util.Scanner;

public class SubStringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		int result = getSubString(str1, str2);
		
		if(result != -1) {
			System.out.println("Index " +result);
		} else {
			System.out.println("Substring not found");
		}
		
	}
	
	public static int getSubString(String str1, String str2) {
		
		for(int i=0; i<=str1.length()-str2.length(); i++) {
			if(str1.substring(i, i+str2.length()).equals(str2)) {
				return i;
			}
		}
		
		return -1;
	}

}
