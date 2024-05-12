package Interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex1 {

	public static void main(String[] args) {
	int stored[] = {10,10,10,20,30,40,20,10};
	LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
	for(Integer itr : stored) {
		if(map.containsKey(itr)) {
			int count = map.get(itr);
			map.put(itr, count+1);
		}else 
			map.put(itr, 1);
	}
	map.entrySet().stream().filter(f -> f.getValue() > 1)
			.forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));	
	System.out.println("-----------");
	List<Integer> list=  Arrays.stream(stored).boxed().collect(Collectors.toList());
		list
		.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(f -> f.getValue()>1)
		.forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
	}

}
