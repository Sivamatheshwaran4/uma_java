package Practices;

public class Final_Empty_Variable {
	final int num;
	
	public Final_Empty_Variable (int num) {
		this.num=num;
		System.out.println(num);
	}

	public static void main(String args[]) {
		Final_Empty_Variable obj = new Final_Empty_Variable(5);
		
	}
}
