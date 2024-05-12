package Practices;

public class Missing_Number_Array {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 6 };
		int n = arr.length;
		int sum = (n + 1) * (n + 2) / 2;
		for (int i = 0; i < n; i++)
			sum = sum - arr[i];
		System.out.println("Missing Element : " + sum);
	}
}
