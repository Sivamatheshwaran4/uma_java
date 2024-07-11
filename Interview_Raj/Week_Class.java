package Interview_Raj;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Week_Class {

	public void show() {
		List<String> list = Arrays.asList("Monday", "Tuesday", "WednesDay", "Thurday", "Friday", "Saturday", "Sunday");
		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day of Number");
		int number = sc.nextInt();

		try {
		if ((number >= 1) || (number <= list.size())) {
			for (int i = 0; i <= list.size(); i++) {
				result = list.get(number - 1);
				break;
			}
		} 
		System.out.println("Result : " + result);
		}catch (Exception  e ) {
			System.out.println("OOps You Choosed Wrong Number");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week_Class obj = new Week_Class();
		obj.show();
	}

}
