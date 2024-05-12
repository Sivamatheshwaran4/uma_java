package Practices;

import java.util.HashMap;

public class Find_Frequency_Word {
	public static void main(String[] args) {
		String str = "Raja Raji Raja";
		String[] splitStr = str.split(" "); 
		HashMap<String , Integer> map = new HashMap<String,Integer>();
		for (int i = 0; i <splitStr.length; i++) {
			if (map.containsKey(splitStr[i])) {
				int count = map.get(splitStr[i]);
				map.put(splitStr[i], count+1);
			}
			else
				map.put(splitStr[i], 1);
		}
		map.entrySet()
		.stream()
		.forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
	}
}
