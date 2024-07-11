package Practices;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Sub_Array_Count {

		public static void main(String[] args) {
	        int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
	        int target = 3 , count =0;
	        List<String> list = new ArrayList<>();

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] + arr[j] == target) {
	                	count++;
	                    list.add("Pair: (" + arr[i] + ", " + arr[j] + ") at indices: (" + i + ", " + j + ")");
	                }
	            }
	        }

	        System.out.println("Total Pairs :" + count);
	        for (String s : list) {
	            System.out.println(s);
	        }
	    }

}
