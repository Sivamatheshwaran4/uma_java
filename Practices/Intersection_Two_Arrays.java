package Practices;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Intersection_Two_Arrays {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5,4};
        int[] array2 = {3, 4, 5, 6, 7 , 3};
        
        Set<Integer> list1 = Arrays.stream(array1).boxed().collect(Collectors.toSet());
        
        Set<Integer> list2 = Arrays.stream(array2).boxed().filter(list1::contains).collect(Collectors.toSet());
        
         System.out.println(list2);

	}

}
