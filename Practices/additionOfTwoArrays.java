package Practices;

import java.util.Arrays;
import java.util.stream.IntStream;

public class additionOfTwoArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };

		if (arr1.length != arr2.length) {
			System.out.println("Arrays must have the same length to add them element-wise.");
			return;
		}

		int[] result = new int[arr1.length];  // addTwoArraysInThirdArray
		for (int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i] + arr2[i];
		}
		System.out.println("Resultant array after addition:");
		for (int i : result) {
			System.out.println(i + " ");
		}

		System.out.println("Sum Of Two Array Using stream --------");
		int[] result2 = IntStream.range(0, arr1.length).map(i -> arr1[i] + arr2[i]).toArray();
		for (int j : result2) {
			System.out.println(j + " ");

		}
	}
    }

