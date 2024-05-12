package Practices;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Maximum_Number {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 4, 3, 7, 9, 5, 8 };
		int max=arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		System.out.println("The biggested number is :" + max);
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int maxNum = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Maxmum Number is :  " + maxNum);
		
	}

}
