package Practices;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Remove_Duplicate_Number {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3,2, 4, 5, 6,5};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		System.out.print("Using Set :");
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		
		// Stream using Set
		System.out.print("Using Stream Set :");
		Set<Integer> setList = Arrays.stream(arr).boxed().collect(Collectors.toSet());
		System.out.println(setList);
	
		// Stream using Distinct
		System.out.print("Using Stream Distinct :");
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		list.stream().distinct().forEach(System.out::print);		
		System.out.println("------------");
		
		System.out.print("Using Stream Filter :");
	   list.stream().filter(f -> set.add(f)).forEach(System.out::println);

		
		
	}

}
