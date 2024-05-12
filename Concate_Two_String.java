package Practices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concate_Two_String {
	public static void main(String[] args) {
		String s1 = "Uma";
		String s2 = "Blacky";
		System.out.println("Concate Two String : " + s1.concat(s2));
		System.out.println("----------------");
		String[] arr1 = { "uma", "blacky" };
		String[] arr2 = { "hey", "you", "uma" };

		List<String> list1 = Arrays.stream(arr1).collect(Collectors.toList());
		List<String> list2 = Arrays.stream(arr2).collect(Collectors.toList());
		System.out.println("Remove Duplite value from List :");
		Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toSet())
				.forEach(sout -> System.out.println(sout + " ")); // Stream<String>
		System.out.println("----------------");

		// stream has already been operated upon or closed
		System.out.println("Find Duplicate from Two List : ");
		Set<String> set = new HashSet<String>();
		Stream.concat(list1.stream().map(m -> m.toLowerCase()), list2.stream().map(m -> m.toLowerCase()))
				.filter(f -> !set.add(f)).forEach(System.out::println);

	}

}
