package Practices;

public class Palindrome_Num {

	public static void main(String[] args) {
		int n=545 , sum=0, r , temp;
		temp= n;
		while(n>0) {
			r=n%10;
			sum = (sum*10) + r;
			n=n/10;
		}
		if(temp==sum) 
			System.out.println("Given num is Palindrome");
		
		else
			System.out.println("Given num is not palindrom");
		

	}

}
