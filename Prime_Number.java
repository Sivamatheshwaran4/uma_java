package Practices;

public class Prime_Number {

	public static void main(String[] args) {
		int n=3 , m=0 , flag=0;
		m=n/2;
		if(n==0 || n==1) {
			flag =1;
			System.out.println(n + " Is not prime Num");
		}
		else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					flag = 0;
					break;
				}
			}
		}
		if(flag==0)
			System.out.println(n + " Is prime Num");
	}

}
