package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex3 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int sum = 0, firstNum = arr[0], lastNum = arr[arr.length - 1] , count=0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			count++;
		}
		System.out.println("Sum : " + sum);
		System.out.println("Last Sum : " + (sum - lastNum));

		System.out.println("--------------------");
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
	
		int summ = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum : " + summ);

		Stream<Integer> stream = list.stream();
		Integer lastEle = stream.skip(count - 1).findFirst().get();
		System.out.println("Last Element of List : " + lastEle);
	}
}
