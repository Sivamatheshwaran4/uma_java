package Practices;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "MomDad";
        String s2 = "DadMon";
        boolean status = true;  
        int l1= s1.length() , l2=s2.length();
        if(l1 !=l2) 
        	status = false; 
        else{
        	char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
        	Arrays.sort(ArrayS1);
        	Arrays.sort(ArrayS2);
        	status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status)   
            System.out.println(s1 + " and " + s2 + " are anagrams");  
         else 
            System.out.println(s1 + " and " + s2 + " are not anagrams");          
       System.out.println("------------------"); 
        s1 = Stream.of(s1.split("")).map(m -> m.toUpperCase()).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(m -> m.toUpperCase()).sorted().collect(Collectors.joining());
        if (s1.equals(s2))
            System.out.println("Two strings are anagrams");
        else
            System.out.println("Two strings are not anagrams");
    }
}
