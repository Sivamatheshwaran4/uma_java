package Practices;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

// count of each elements 

public class Find_Duplicate_Count_Stream {
	public static void main(String[] args) {
	int stored[] = { 2, 1, 4, 3, 7, 9, 5, 8, 2, 3};
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
		.collect(Collectors.groupingBy(e -> e ,Collectors.counting()))
		.entrySet()
		.stream()
//		.filter(f -> f.getValue()>1)
		.forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
	}

}
