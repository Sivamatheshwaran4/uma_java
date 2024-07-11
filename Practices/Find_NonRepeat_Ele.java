package Practices;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_NonRepeat_Ele {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 4, 3, 5,2, 3 };
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (hashmap.containsKey(list.get(i))) {
				int count = hashmap.get(list.get(i));
				hashmap.put(list.get(i), count + 1);
			} else
				hashmap.put(list.get(i), 1);
		}
		hashmap.entrySet().stream()
		.forEach(e ->
		System.out.println( e.getKey() + " : " + e.getValue()));
		System.out.println("------------");
		
		hashmap.entrySet().stream()
		.filter(m -> m.getValue()==1)
		.forEach(e ->
		System.out.println(e.getKey()));
		
		System.out.println("Not Duplicate Find Using Stream ----");		
		list.stream()
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        .entrySet()
        .stream()
        .filter(m -> m.getValue()==1)
        .forEach(e ->
		System.out.println(e.getKey()));
		
		
	}
}
