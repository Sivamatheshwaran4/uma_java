package Practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// get start and end element 

public class Get_EleWith_Start_End_Index {
		
	public static void main(String[] args) {
		
		List<String> obj = Arrays.asList("A", "B", "C", "D", "E", "F" );
		int start =0 , end = 3;	
		IntStream.range(start, end).mapToObj(obj::get).forEach(System.out::print);
	}

}
