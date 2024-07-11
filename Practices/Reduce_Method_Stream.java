package Practices;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Reduce_Method_Stream {

	public static void main(String[] args) {
			List<Integer> intlist = Arrays.asList(1,2,6,4,5,3);		
			System.out.println(intlist.stream().reduce(Integer::min));
			System.out.println(intlist.stream().reduce(Integer::max));
			System.out.println(intlist.stream().reduce(Integer::sum)); 		
			Optional<Integer> largerElement= intlist.stream().reduce((ele1,ele2) -> ele1 > ele2 ? ele1 : ele2);
			System.out.println ("Larger Number : " + largerElement.get());		
				
		String str[] = {"Uma","Ralagaa","Blacky","Arasu","Yugi","Aadhi"};
		List<String> list = Arrays.stream(str).collect(Collectors.toList());
		// binary function 
		Optional<String> reduce1 = list.stream().reduce((ele1,ele2) -> ele1+ele2); 
		System.out.println("Reduce1  : " + reduce1.get());
		
		Optional<String> largeWord =  list.stream().reduce((ele1,ele2) -> ele1.length() > ele2.length() ? ele1 : ele2);
		System.out.println("large Word :" + largeWord.get());
		
		// identity and accumlator 
		String reduce2 = list.stream().reduce("Concating String is : " , (ele1,ele2) -> ele1.concat(ele2));
		System.out.println("Reduce2  : " + reduce2);
		
		
			

		
		

	}
}
