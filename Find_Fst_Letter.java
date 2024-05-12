package Practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Fst_Letter {

	public static void main(String[] args) {
		String str = "This Is Uma Thease";
		String strArr[] = str.split(" ");
		System.out.print("Second Letter Of Each Word : ");
		for(int i=0; i<strArr.length; i++) 		
		 //	 System.out.print(strArr[i].charAt(0) + " ");  // print fst letter 
			 System.out.print(strArr[i].substring(1,2));
		
		System.out.println("-------------------");
		
		// using stream 
		System.out.print("First Letter Of Each Word : ");
		List<String> list = Arrays.stream(strArr).collect(Collectors.toList());
		list.stream()
		.map(m -> m.charAt(0))
		.forEach(s -> System.out.println(s + " "));
		System.out.println("-------------------");
		
		//find out all the numbers starting with 1 using Stream functions
		System.out.println
		("Start With Particular Word : ");
		list.stream().filter(f -> f.startsWith("T")).forEach(System.out::println);
		
	}

}
