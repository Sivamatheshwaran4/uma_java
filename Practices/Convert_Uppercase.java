package Practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert_Uppercase {

	public static void main(String[] args) {
		String str = "Siva  is bad boy";
		String strUpper = str.toUpperCase();
		String strLower = str.toLowerCase();
		System.out.println("To Upper Case :" +strUpper);
		System.out.println("To lower Case :" +strLower);
		
		String[] arr =str.split(" ");
		List<String> list = Arrays.stream(arr).collect(Collectors.toList());
		// List<String> list = Arrays.asList(arr);
		list.stream().map(m -> m.toUpperCase()).forEach(System.out::print);
	}
}
