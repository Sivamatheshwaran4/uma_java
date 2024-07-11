package Practices;

public class Exception_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int str = 12;
		try {
			int result = 12/0;
			System.out.println(result);
		}catch(Exception e) {
			  System.out.println("Exception caught: " + e.getMessage());
		}
		finally {
			System.out.println("Finally is always execute");
		}

	}
}
