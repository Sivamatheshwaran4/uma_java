package Interview_Raj;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Count_String {
	
	public void show () {
		String input = "ultramain";
		long count = Stream.of(input.split("")).count();
		System.out.println("Count Of String : " + count);
		
		System.out.println("Count Of String  Using Map :  ");
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int countMap = 0;
		Set<Character> set = new LinkedHashSet<Character>();		
		for( char c : input.toCharArray()) {
			set.add(c);
			countMap++;
			map.put(c, countMap);
		}
		long countResult = map.entrySet().stream().count();
		System.out.println(countResult);
		
		System.out.print("Removed Duplicate Charater from String : ");
		set.forEach(System.out::print);
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count_String obj = new Count_String ();
		obj.show();
	}

}
