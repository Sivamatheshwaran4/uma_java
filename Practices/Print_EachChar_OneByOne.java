package Practices;



// print nextLine
public class Print_EachChar_OneByOne {

	public static void main(String[] args) {
		String name = "John";

        // Print each character of the name one by one
        name.chars()
            .mapToObj(c -> (char) c)
            .forEach(System.out::println);
        System.out.println("------------------");
        
        for(char c : name.toCharArray()) {
        	System.out.println(c);
        }
	}
}
