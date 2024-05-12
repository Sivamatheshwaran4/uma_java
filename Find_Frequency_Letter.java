package Practices;

import java.util.HashMap;
import java.util.Map;

public class Find_Frequency_Letter {
	public static void main(String[] args) {
		String s = "geeksforgeeks";
		Map<Character , Integer> map = new HashMap<Character,Integer>();
		for(char c : s.toCharArray()) {
			if(map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, count+1);
			}else
				map.put(c,1);
		}
		map.entrySet()
		.stream()
		.forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
		
		System.out.println("----------------------------");
		map.entrySet()
		.stream()
		.filter(f -> f.getValue()==1)
		.forEach(e -> System.out.println(e.getKey() + " : "+ e.getValue()));
	}
}
