package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {

	public static void main(String[] args) {
		String arr[]= {"A","B","C","D","E","F"};
		for(int i=0; i<arr.length-1;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("----------------");
		List<String> list = Arrays.stream(arr).collect(Collectors.toList());
		list.stream().limit(list.size()-1) .forEach(e -> System.out.print(e + " "));
		
	}

}
