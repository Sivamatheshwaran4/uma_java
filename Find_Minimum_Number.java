package Practices;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Minimum_Number {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 4, 3, 7, 9, 5, 8 };
		int min = arr[0] ;
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println("The Smallest number is :" + min);
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int minNum = list.stream().min(Comparator.naturalOrder()).get();	
		System.out.println("MinimumS Number is :  " + minNum);
		
	}

}
