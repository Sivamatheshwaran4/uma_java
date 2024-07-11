package Practices;

public class Amstrong_Number {

	public static void main(String[] args) {
		int num = 153 , temp , r, sum=0;
		temp = num;
		while(num>0) {
			r=num%10;
			sum = sum + (r*r*r);
			num = num/10;
		}
		if(temp==sum) 
			System.out.println("Given Number Is Amstrong");
		else
			System.out.println("Given Number is Not An Amstrong");
	}
}
