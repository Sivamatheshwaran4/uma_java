package Practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Find_Fst_Last_Ele_List {

	public static void main(String[] args) {
		String str = "This Is Uma Thease";
		List<String> list =Stream.of(str.split(" ")).collect(Collectors.toList());
		
		String getFstEle  = list.stream().findFirst().get();
		System.out.println("First Element of List : " + getFstEle);
		
		System.out.println("-------------------");	
		Stream<String> stream = list.stream();
		String getLastEle = stream.skip(list.size() - 1).findFirst().get();
		System.out.println("Last Element of List : " + getLastEle);
		
	}
}
