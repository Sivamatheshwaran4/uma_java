package Practices;

// you can avoid iterating over the same digits multiple times by changing the loop structure.
public class Count_Possible_3Digit {

	public static void main(String[] args) {
		int[] digits = { 1, 2, 3, 4 };
        int count = 0;
      
        for (int i = 0; i < digits.length; i++) { 
            for (int j = 0; j < digits.length; j++) { 
                if (j == i) continue; // Skip if the tens place digit is the same as the hundreds place digit
                for (int k = 0; k < digits.length; k++) { // each digit for the units place
                    if (k == i || k == j) continue;
                    int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                    System.out.println(number);
                    count++;
                }
            }
        }
        System.out.println("Number of 3-digit numbers: " + count);
	}

}
