package Practices;

public class Exception_Ex4 {

		 public static void main(String[] args) {
		        String filePath = "invalid_path.txt";
		        try {
		            if (filePath.equals("invalid_pat.txt")) {
		                // This block is currently empty
		            } else {
		                System.out.println("else block");
		                throw new Exception_Ex3("File not found throw by User.");
		            }
		        } catch (Exception_Ex3 e) {
		            System.out.println("Exception caught: " + e.getMessage());
		        }
		    }


}
