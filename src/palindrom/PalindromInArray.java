package palindrom;

public class PalindromInArray {

	public static void main(String[] args) {
		String[]names = new String[] {"anrna","avva","abBA","anas"};
		checkPalindrom(names);
//		checkPalindrom2(names);

	}

	public static void checkPalindrom(String[]names) {
		boolean flag = false;
		for (int i = 0; i < names.length; i++) {
			for(int j= names[i].length()-1 ,  k=0 ; j >= 0  ;j--, k++) {
				if (names[i].charAt(k)==names[i].charAt(j))
					flag = true;
				else 
					flag = false;
			}
			if (flag)
				System.out.println("its palindrom");
			else
				System.out.println("its not");
				
			}
		
	}
	// this is perfect way
	public static void checkPalindrom2(String[]words) {
		String x="";
		for (String item: words) {
			for(int j = item.length()-1 ; j >= 0 ; j--) {
				x+= item.charAt(j);
				
			}
			if(x.equalsIgnoreCase(item)) {
				System.out.println(item +" its palindrom.");
				x=""; 							// here we do the x is empty again 
			}else 
				System.out.println(item +" its not");
				x="";							// here the same thing
		}
	}
	
}
