package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		String arr[] = { "A", "B", "C", "D", "E", "F" };
		String firstNum = arr[0], secondNum = arr[1];
		System.out.println("[" + firstNum + "," + secondNum + "]");
		
		System.out.println("------------");
		List<String> list = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
		List<String> sublist = list.subList(0, 2); // find first and second element
		System.out.println(sublist);
	}

}
