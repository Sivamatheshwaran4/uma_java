package Practices;

public class Prime_Number {

public static void main(String[] args) {
        int n = 4;
        int flag = 1;

        if (n == 0 || n == 1) {
            flag = 0;
            System.out.println(n + " is not a prime number");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = 0;
                    break;
                }
            }
        }

        if (flag == 1) {
            System.out.println(n + " is a prime number");
        } else if (n > 1) {
            System.out.println(n + " is not a prime number");
        }
    }

}
