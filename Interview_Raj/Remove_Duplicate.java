package Interview_Raj;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Duplicate {

	public void show() {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 7, 5);
		System.out.println("Remove Duplicate : ");
		list.stream().collect(Collectors.groupingBy((e -> e), Collectors.counting())).entrySet().stream()
				.filter(f -> f.getValue() == 1).forEach(e -> System.out.print( e.getKey() + " "));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove_Duplicate obj = new Remove_Duplicate ();
		obj.show();

	}

}
