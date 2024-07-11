package Practices;

import java.io.IOException;

public class Exception_Ex2 {

	 public static void main(String[] args) {
		 String filePath = "invalid_path.txt";
	        try {
	        	 if (filePath.equals("invalid_pat.txt")) {	          
	 	        } else {
	 	        	System.out.println("else block");
	 	           throw new IOException("File not found throw by User. ");
	 	        }
	        } catch (IOException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }

}
