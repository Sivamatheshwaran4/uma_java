package Practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Concat_Two_Integer_Arrays {
    public static void main(String[] args) {
        int[] a = new int[]{4, 2, 7, 1,10};
        int[] b = new int[]{8,2, 3, 9, 5};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c));

        String[] arr1 = { "uma", "blacky" };
		String[] arr2 = { "hey", "you", "uma" };
 
		List<String> list1 = Arrays.stream(arr1).collect(Collectors.toList());
		List<String> list2 = Arrays.stream(arr2).collect(Collectors.toList());
		System.out.println("Remove Duplite value from List :");
		Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toSet())
				.forEach(sout -> System.out.println(sout + " ")); // Stream<String>
		System.out.println("----------------");
      
    }
}
