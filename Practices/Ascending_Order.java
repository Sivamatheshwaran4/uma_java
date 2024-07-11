package Practices;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ascending_Order {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 4, 3, 7, 9, 5, 8 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order In Java : ");
		for (int itr : arr) 
			System.out.println(itr + " ");
			
		List<Integer> stream_arr = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println("Ascending Order In Stream : ");
		stream_arr.stream().sorted().forEach(System.out::println);
		
		// Finding second smallest element
		System.out.println("--------------------");	
		Optional<Integer> secondSmallestEle = stream_arr.stream().sorted().skip(1).findFirst();
		System.out.print("Second Smallest Element : " + secondSmallestEle.get());
	}
}
