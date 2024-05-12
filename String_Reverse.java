package Practices;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class String_Reverse {

	public static void main(String[] args) {
		String str = "This Is Uma";
		String [] strArr = str.split(" ");
		String sentenceRev = "" , LetterRev="" , LetterSentecneRev="";
		
		System.out.println("Before Reverse : " + str);
		for (int i = strArr.length - 1; i >= 0; i--) {
			sentenceRev = sentenceRev + " " + strArr[i];
			for (int j = strArr[i].length() - 1; j >= 0; j--) 
				LetterSentecneRev = LetterSentecneRev + strArr[i].charAt(j) + " ";			
		}	
		System.out.println("Reverse Sentence : " + sentenceRev );
		System.out.println("Reverse Letter : " + LetterSentecneRev );
		
		for (int i = 0; i <= strArr.length - 1; i++) {
			for (int j = strArr[i].length() - 1; j >= 0; j--)
				LetterRev = LetterRev + strArr[i].charAt(j) + " ";
		}	
		System.out.println("Reverse Letter Only : " + LetterRev );
		System.out.println("--------------------------------------------");
		
		// reverse using stream 
		List<String> listStr = Arrays.stream(strArr).collect(Collectors.toList());  // ***********
		listStr.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
