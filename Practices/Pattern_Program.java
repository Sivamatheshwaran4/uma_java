package Practices;

public class Pattern_Program {

	public static void main(String[] args) {
		String str = "PROGRAM";
		for (int i = str.length() - 1; i >= 0; i--) {
			for (int j = i; j <= str.length() - 1; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println(" ");
		}
	}

}
