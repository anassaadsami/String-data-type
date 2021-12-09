package palindrom;

public class PalindromEasyWay {

	public static void main(String[] args) {
		System.out.println(check("an n a"));

	}

	// method check if String is Palindrom without care about spaces
	public static boolean check(String name) {
		name = name.replace(" ", "");
		System.out.println(name);
		for (int i = 0, j = name.length() - 1; i < name.length(); i++, j--) {
			// here once loop will be (!=) will break the for loop and return false
			if (name.charAt(i) != name.charAt(j))

				return false;
			break;
		}
		return true;
	}
}
