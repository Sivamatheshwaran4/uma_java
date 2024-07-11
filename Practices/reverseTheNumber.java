package Practices;
public class reverseTheNumber {
    public static void main(String[] args) {
        int number=12345 , r;
        String reverse = "";
        while (number>0) {
        	r = number%10;
        	reverse = reverse+r;
        	number = number/10;
        }
        System.out.println(reverse);
    }

}
