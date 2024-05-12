package Practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fst_Lst_Ele_List {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 4, 3, 7, 9, 5, 8, 2, 3 };
		System.out.println(arr[0] + " Last :" + arr[arr.length-1]);
		
		List<Integer> myList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		long count = myList.stream().count(); // find total element
		
		System.out.print("First element of List :");
		myList.stream().findFirst().ifPresent(System.out::println);		
		
		Stream<Integer> stream = myList.stream();	   
		Integer lastEle = stream.skip(count - 1).findFirst().get();
		System.out.println("Last Element of List :" +lastEle);	
		
		System.out.println("Number of element in List :" +count);
		
		Integer sum = myList.stream()
				  .mapToInt(Integer::intValue)
				  .sum();
		System.out.println("Sum Of List :" + sum);
	}
	
}
