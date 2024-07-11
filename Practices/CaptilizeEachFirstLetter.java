package Practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CaptilizeEachFirstLetter {
	public static void main(String[] args) {
		String str = "how are you";
        List<String> words = Arrays.asList(str.split("\\p{Zs}")); // str.split("\\s+"))
        
        List<String> capitalizedWords = words.stream()
           .map(word -> word.substring(0,1).toUpperCase() + word.substring(1, word.length()))
//        		.map(word -> {
//        			StringBuilder sb = new StringBuilder(word);
//                    sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
//                    return sb.toString();
//        		})
                .collect(Collectors.toList());
        
        capitalizedWords.forEach(System.out::println);
	}

}


