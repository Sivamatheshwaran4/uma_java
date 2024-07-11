package Practices;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Add_Special_Character {

	public static void main(String[] args) {
		        String[] inputs = {"a", "b", "c"};
		        StringBuilder result = new StringBuilder();
		        for (String input : inputs) {
		            result.append(input).append("|");
		        }
		        // Remove the last '|' character
		        if (result.length() > 0) {
		            result.deleteCharAt(result.length() - 1);
		        }
		        
		 System.out.println(" >>>>>>>>>  " + result.toString());

		String str2[] = {"Uma","Ralagaa","Blacky","Arasu","Yugi","Aadhi"};
		List<String> list = Arrays.stream(str2).collect(Collectors.toList());
		String strConcatJoin = list.stream().collect(Collectors.joining("|"));
		System.out.println(strConcatJoin);
		
//		Optional <String> strConcatReduce = list.stream().reduce((a,b) -> (a+ "|" + b));
//		System.out.println(strConcatReduce.get());
		
	}
}
