package palindrom;


import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
//		String [] names= new String[] {"anas","saad","pop","abba"};
//		int i ,j ;
//		for ( int item= 0 ; item < names.length ;item++) {
//			for( i=0 ; i < item.length();i++) {
//				
//			}
//			
//		}
//		
		Scanner input = new Scanner(System.in);
		System.out.print("enter you first word:");
		String name = input.nextLine();
		boolean flag = false;
		
		for (int i = 0 ,j=name.length()-1; i < name.length() ; i++ ,j--) {
		if(	name.charAt(i)==(name.charAt(j))) {
			
			flag = true;
			
		}else 
			flag = false;
			
		}
		if(flag) {
			System.out.println("palindrom");
		}else
			System.out.println("not");
			
			
		
		
		
		System.out.print("enter your second word:");
		 String name2 = input.nextLine();
		 String reverse ="";
		 for(int k = name2.length()-1 ; k>=0 ; k--) {
			 reverse+=name2.charAt(k);
		 }
		 if(name2.equals(reverse))
			 System.out.println(name2 +" its palindrom.");
		 else 
			 System.out.println(name2+" its not");
		 input.close();
	}
	
	
		 
		 
		
	
		


}