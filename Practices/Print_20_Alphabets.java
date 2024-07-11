package Practices;

import java.util.stream.IntStream;

public class Print_20_Alphabets {

	public static void main(String[] args) {
		 
		int n = 20;
        // Generate the first 20 alphabets
        IntStream.range(0, n)
                 .mapToObj(i -> (char) ('a' + i))
                 .forEach(System.out::println);
        
        IntStream.range(0, n)
        .mapToObj(i -> (Integer) (1 + i))
        .forEach(System.out::println);
        
   
	}

}
