package Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList_To_Arrays {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5,4));
		
		// Convert ArrayList to Integer array using foreach loop
        Integer[] intArray = new Integer[list.size()];
        int index = 0;
        for (Integer element : list) {
            intArray[index++] = element;
        }
    	System.out.println("Converted array: " + Arrays.toString(intArray));
        
		Integer[] result = list.stream().toArray(Integer[] :: new);
		System.out.println("Converted array: " + Arrays.toString(result));
		

	}

}
