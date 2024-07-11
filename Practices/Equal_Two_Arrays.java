package Practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Equal_Two_Arrays {

	public static void main(String[] args) {
		int[] arrayOne = { 2, 5, 1, 7, 4 };

		int[] arrayTwo = { 2, 5, 1, 7, 4 };

		boolean equal = true;

		if (arrayOne.length == arrayTwo.length) {
			for (int i = 0; i < arrayOne.length; i++) {
				if (arrayOne[i] != arrayTwo[i]) 
					equal = false;
			}
		} else {
			equal = false;
		}

		if (equal) {
			System.out.println("Two Arrays Are Equal");
		} else {
			System.out.println("Two Arrays Are Not equal");
		}
		
		System.out.println("----------------");
		// Arrays equal using stream 
		List<Integer> l1 = Arrays.stream(arrayOne).boxed().collect(Collectors.toList());
		List<Integer> l2 = Arrays.stream(arrayTwo).boxed().collect(Collectors.toList());
				
		Boolean result2 = IntStream.range(0, l1.size())
                .allMatch(i -> l1.get(i).equals(l2.get(i)));
		if(result2) {
			System.out.println("Two Arrays Are Equal");
		}else {
			System.out.println("Two Arrays Are Not equal");
		}
	}

}
