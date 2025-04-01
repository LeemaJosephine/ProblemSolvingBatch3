package day3;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char result = findFirstUniqueCharacter(str);
		
		if(result != '\0') {
			System.out.println("First non repeating element is: "+result);
		}else{
			System.out.println("No repeating elements");
		}
	}

	
	public static char findFirstUniqueCharacter(String str) {
		
		for(int i=0;i<str.length();i++) {
			
			boolean isUnique=true;
			
			for(int j=0;j<str.length();j++) {
				
				if(i !=j && str.charAt(i)==str.charAt(j)) {
					isUnique=false;
					break;
				}
			}
			if(isUnique) {
				return str.charAt(i);
			}
		}
		
		return '\0';
	}
}
