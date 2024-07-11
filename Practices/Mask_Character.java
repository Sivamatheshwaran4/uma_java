package Practices;

public class Mask_Character {

	public static void main(String[] args) {
		String cardNum = "1234567890123456";
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<12;i++) {
			sb.append("*");
		}
		sb.append(cardNum.substring(12));
		System.out.println(sb);
	}

}
