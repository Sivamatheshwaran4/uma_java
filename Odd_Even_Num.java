

package Practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Odd_Even_Num {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 4, 3, 7, 9, 5, 8 };
		System.out.println("Even Number : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				System.out.println(arr[i] + " ");
		}

		// Using Stream
		System.out.println("Even Num Stream : ");
		List<Integer> even_num_stream = Arrays.asList(2, 1, 4, 3, 7, 9, 5, 8); // static array
		even_num_stream.stream().filter(ftr -> ftr % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("Odd Number : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				System.out.println(arr[i] + " ");
		}

		// Using Stream
		System.out.println("Odd Num Stream : ");
		List<Integer> odd_num_stream = Arrays.asList(2, 1, 4, 3, 7, 9, 5, 8); // static array
		odd_num_stream.stream().filter(ftr -> ftr % 2 != 0).collect(Collectors.toList()).forEach(System.out::println);
	}
}
