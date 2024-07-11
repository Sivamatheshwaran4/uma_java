package Practices;

import java.util.LinkedHashSet;

public class Count_String_Value_Remove_Duplicate {

	public static void main(String[] args) {
		String str = "Ultramain";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		char[] srtArray = str.toCharArray();
		
		System.out.println("count : " +srtArray.length);
		
		for(char c : srtArray ) {
			set.add(c);
		}
		System.out.println(set);	
	}

}
