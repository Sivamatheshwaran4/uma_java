package Practices;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "moM";
		String reverse = "";
		for(int i=str.length()-1 ; i>=0 ; i--) {
			reverse = reverse+str.charAt(i);
		}
		System.out.println("Reverse String :" + reverse);
		
		if(str.equalsIgnoreCase(reverse))
			System.out.println("Given String is palindrom");
		else
			System.out.println("Given String is not Palindrom");
		
		
	}

}
