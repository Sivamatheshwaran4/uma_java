package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {

	public static void main(String[] args) {
		int arr[] = {1,2,1,3,4};
		int count=0;
		for(int itr : arr) {
			count++;
		}
		System.out.println("Count : " + count);
		System.out.println("--------------------");
		
		List<Integer> obj = Arrays.stream(arr).boxed().collect(Collectors.toList());
		long countt = obj.stream().count();
		System.out.println("Count : "+countt);
	}
	

}
