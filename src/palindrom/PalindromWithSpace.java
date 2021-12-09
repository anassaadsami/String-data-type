package palindrom;

import java.util.Scanner;

public class PalindromWithSpace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	System.out.println(reversInt(input));
		
		input.close();
	}
	
	public static boolean reversInt(Scanner input ) {
	
		System.out.println("enter your word: ");
		String name = input.nextLine();
		boolean flag = true ;
		// here we make another String variable with same name and replace all space 
		// if we code directly name.replace(" ","")   -----> wrong cause the String is immutable 
		name = name.replace(" ", "");  
		for (int i = 0 , j=name.length()-1 ; i < name.length(); i++, j--) {
			if(name.charAt(i) == name.charAt(j))
				flag =  true ;
			else 
				flag =  false;	
	}
		if(flag)
			return true ;
		else 
			return false ;
		

	}

}


