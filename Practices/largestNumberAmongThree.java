package Practices;

public class largestNumberAmongThree {
	public static void main(String[] args) {
        int a = 3 , b=8 , c=5;
        if(a>b && a>c) {
        	System.out.println("A is Largest number");
        }
        else if (b>a && b>c){
        	System.out.println("B is Largest number");
        }
        else {
        	System.out.println("C is Largest number");
        }
    }

}
