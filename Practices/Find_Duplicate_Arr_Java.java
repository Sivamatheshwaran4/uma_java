package Practices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_Duplicate_Arr_Java {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 4, 3, 7, 9, 5, 8, 2, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) 
					System.out.println(arr[i]);
			}
		}		
		
		
		// find duplicate elements in a given integers list 
		System.out.println("Find Duplicate using Stream -------");
		List<Integer> myList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Set<Integer> set = new HashSet<Integer>();
		myList.stream()
		.filter(f -> !set.add(f))
		.forEach(System.out::println);
      
	}	
}
