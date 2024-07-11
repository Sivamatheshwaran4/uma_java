package Practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Separate_Zero_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int[] array = {0, 1, 0, 2, 3, 0, 4, 5, 0};
		   
		   List<Integer> list1 = Arrays.stream(array).boxed().filter(f -> f!=0).collect(Collectors.toList());
		   List<Integer> list2 = Arrays.stream(array).boxed().filter(f -> f==0).collect(Collectors.toList());
		   Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList()).forEach(System.out::println);
		   
		   
	
		   

	}

}
