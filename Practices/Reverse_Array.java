package Practices;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 5, 8, 4, 10};
		
		System.out.println("Reverse Array Using Stream : ");
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());	
		IntStream.range(0, list.size()).mapToObj(m -> list.get(list.size()-1-m)).forEach(System.out::println);
		
		System.out.println("Reverse Array Using Java : ");
		int[] revArr = new int[arr.length];
		for(int i=arr.length-1 , j = 0; i >= 0; i--, j++) {
			revArr[j]= arr[i];
		}
		Arrays.stream(revArr).forEach(System.out::println);
	}

}
