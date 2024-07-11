package Practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sum_Without_Fst_Lst_Stream {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };	
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
	
		int summ = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of list : " + summ);
		System.out.println("--------------------");
		
		int sumWithoutFirst = list.stream().skip(1).mapToInt(Integer::intValue).sum();
		System.out.println("sumElemenationFst : " + sumWithoutFirst);
		System.out.println("--------------------");
		
		int sumWithoutLast = list.stream().limit(list.size()-1).mapToInt(Integer::intValue).sum();
		System.out.println("sumElemenationLast : " + sumWithoutLast);
		System.out.println("--------------------");
		
	
	}
}
