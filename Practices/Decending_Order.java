package Practices;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Decending_Order {

	public static void main(String[] args) {
		int[] arr = {2,4,3,1,6,7,8 };
		int temp = 0;	
		System.out.print("Decending Order In Java : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		Arrays.stream(arr).forEach(System.out::println);
			
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList()); // *********
		System.out.println("Array Decending Order : ");
		List<Integer> streamList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(streamList);
		
		// find second largest element Using Stream 
		System.out.print("Second Largest Element : ");
		 Optional<Integer> secondLargestEle = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(secondLargestEle.get());
		
		
	}
}
