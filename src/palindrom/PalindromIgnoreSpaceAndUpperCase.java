package palindrom;

public class PalindromIgnoreSpaceAndUpperCase {

	public static void main(String[] args) {
		System.out.println(check("ann  A"));

	}
	//check if String is palindrom or not without care about spaces in String
		public static boolean check(String name) {
			
			name = name.replace(" ", "");  // it means we make another String with same name cause if we 
			// code just name.replace(" ","") so when we check after it takes the original name ( immutable)
			// we can String name2 = name.replace(" ","")
			String name2 = "";
			for (int i = name.length()-1; i >= 0 ; i--) {
				name2 += name.charAt(i);
			}
//			System.out.println(name);
//			System.out.println(name2);
			if(name.equalsIgnoreCase(name2))
				return  true ;
			else
				return  false ;
		}

}
